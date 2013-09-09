/**
 * 
 */
package com.vietnamarena.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.vietnamarena.dao.GenericDAO;

/**
 * @author NguyenPV
 *
 */
public abstract class GenericDAOImpl<T> implements GenericDAO<T> {
	
	public abstract String buildSQLQuery(String queryString, T model);
	public abstract String createRemoveAllSQLQuery();
	
	public abstract EntityManager getEntityManager();
	
	private Class<T> persistenceClass;
	
	public GenericDAOImpl(final Class<T> persistenceClass) {
		this.persistenceClass = persistenceClass;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		final String sqlQuery = buildSQLQuery(null, null);
		Query query = getEntityManager().createQuery(sqlQuery);
		List<T> resultList = query.getResultList();
		return resultList;
	}
	
	public void removeAll() {
		final String sqlQuery = createRemoveAllSQLQuery();
		Query query = getEntityManager().createQuery(sqlQuery);
		query.executeUpdate();
	}
	
	public T get(Long id) {
		T entity = null;
		entity = getEntityManager().find(persistenceClass, id);
		return entity;
	}

	/* (non-Javadoc)
	 * @see com.vietnamarena.dao.GenericDAO#saveOrUpdate(java.lang.Object)
	 */
	@Override
	public T saveOrUpdate(T model) {
		T entity = null;
		entity = getEntityManager().merge(model);
		return entity;
	}

	/* (non-Javadoc)
	 * @see com.vietnamarena.dao.GenericDAO#remove(java.lang.Object)
	 */
	@Override
	public void remove(Long id) {
		T model = get(id);
		getEntityManager().remove(model);
	}
	
}
