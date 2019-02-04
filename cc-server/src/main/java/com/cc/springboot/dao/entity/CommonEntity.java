package com.cc.springboot.dao.entity;

import java.util.Date;

import javax.persistence.Column;

public class CommonEntity {

	@Column(name = "createdBy")
	private String createdBy;
	
	@Column(name = "modifiedBy")
	private String modifiedBy;
	
	@Column(name="created")
	private Date created;
	
	@Column(name="modified")
	private Date modified;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

}
