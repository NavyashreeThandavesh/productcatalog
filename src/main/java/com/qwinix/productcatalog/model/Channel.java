package com.qwinix.productcatalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productcatalog")

public class Channel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; 
	@Column(name = "name") private String name;
	@Column(name = "description_by") private String description_By;
	@Column(name = "priority_by") private String priority_By;
	@Column(name = "title_by") private String title_By;
	@Column(name = "action_by") private boolean action_By;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription_By() {
		return description_By;
	}

	public void setDescription_By(String description_By) {
		this.description_By = description_By;
	}

	public String getPriority_By() {
		return priority_By;
	}

	public void setPriority_By(String priority_By) {
		this.priority_By = priority_By;
	}

	public String getTitle_By() {
		return title_By;
	}

	public void setTitle_By(String title_By) {
		this.title_By = title_By;
	}

	public boolean isAction_By() {
		return action_By;
	}

	public void setAction_By(boolean action_By) {
		this.action_By = action_By;
	}



}
