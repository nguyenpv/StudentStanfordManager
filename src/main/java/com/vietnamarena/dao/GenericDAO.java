/**
 * 
 */
package com.vietnamarena.dao;

import java.util.List;

/**
 * @author NguyenPV
 *
 */
public interface GenericDAO<T> {
	
	public List<T> findAll();
	
	public T get(Long id);
	
	public T saveOrUpdate(T model);
	
	public void remove(Long id);
	
	public void removeAll();
}
