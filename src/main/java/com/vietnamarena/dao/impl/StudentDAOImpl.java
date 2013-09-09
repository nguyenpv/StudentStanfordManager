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

import com.vietnamarena.dao.StudentDAO;
import com.vietnamarena.dto.SMStudent;

/**
 * @author NguyenPV
 *
 */
public class StudentDAOImpl extends GenericDAOImpl<SMStudent> implements StudentDAO {
	
	private static Log log = LogFactory.getLog(StudentDAOImpl.class);

	public StudentDAOImpl() {
		super(SMStudent.class);
	}

	@Override
	public List<SMStudent> findStudentByName(String name) {
		log.debug("Start findStudentByName:" + name);
		final String sqlQuery = "select s from SMStudent s " +
				"where upper(s.firstname) like :firstname"
				+ " or upper(s.lastname) like :lastname";
		Query query = getEntityManager().createQuery(sqlQuery);
		query.setParameter("firstname", "%" + name.toUpperCase() + "%");
		query.setParameter("lastname", "%" + name.toUpperCase() + "%");
		@SuppressWarnings("unchecked")
		List<SMStudent> resultList = query.getResultList();
		log.debug("Result findUserByUsername:" + resultList);
		if (resultList == null || resultList.size() < 1) {
			return null;
		}
		return resultList;
	}

	@Override
	public String buildSQLQuery(String queryString, SMStudent model) {
		if (queryString != null) {
			return queryString;
		}
		String sqlQuery = "select s from SMStudent s";
		return sqlQuery;
	}
	
	@Override
	public String createRemoveAllSQLQuery() {
		return "delete from SMStudent s";
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
