/**
 * 
 */
package com.runni.common;

import java.io.Serializable;

/**
 * @author D N
 *
 */
public abstract class BaseEntity<T> implements Serializable {

	private static final long serialVersionUID = 119459297422441236L;
	
	protected String id;
	
	protected Page<T> page;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Page<T> getPage() {
		return page;
	}

	public void setPage(Page<T> page) {
		this.page = page;
	}
	
	
	

}
