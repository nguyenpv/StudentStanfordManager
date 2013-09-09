/**
 * 
 */
package com.vietnamarena.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.vietnamarena.dao.UserDAO;
import com.vietnamarena.dto.SMUser;

/**
 * @author NguyenPV
 *
 */
public class UserDAOImpl extends GenericDAOImpl<SMUser> implements UserDAO {
	
	private static Log log = LogFactory.getLog(UserDAOImpl.class);

	public UserDAOImpl() {
		super(SMUser.class);
	}

	@Override
	public SMUser findUserByUsername(String username) {
		log.debug("Start findUserByUsername:" + username);
		final String sqlQuery = "select u from SMUser u where u.username = :username";
		Query query = getEntityManager().createQuery(sqlQuery);
		query.setParameter("username", username);
		@SuppressWarnings("unchecked")
		List<SMUser> resultList = query.getResultList();
		log.debug("Result findUserByUsername:" + resultList);
		if (resultList == null || resultList.size() < 1) {
			return null;
		}
		return resultList.get(0);
	}

	@Override
	public String buildSQLQuery(String queryString, SMUser model) {
		if (queryString != null) {
			return queryString;
		}
		String sqlQuery = "select u from SMUser u";
		return sqlQuery;
	}
	
	@Override
	public String createRemoveAllSQLQuery() {
		return "delete from SMUser u";
	}


	/* *** GETTERS & SETTERS *** */
	private EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Override
	public EntityManager getEntityManager() {
		return em;
	}

}
