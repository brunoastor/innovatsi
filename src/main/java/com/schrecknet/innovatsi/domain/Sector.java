package com.schrecknet.innovatsi.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sector implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String sector;
	private Date date;
	private List<String> heat;
	private List<String> humidity;
	
	public Sector() {
		
	}	

	public Sector(String id, String sector, Date date, List<String> heat, List<String> humidity) {
		super();
		this.id = id;
		this.sector = sector;
		this.date = date;
		this.heat = heat;
		this.humidity = humidity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<String> getHeat() {
		return heat;
	}

	public void setHeat(List<String> heat) {
		this.heat = heat;
	}

	public List<String> getHumidity() {
		return humidity;
	}

	public void setHumidity(List<String> humidity) {
		this.humidity = humidity;
	}
	
	
}
