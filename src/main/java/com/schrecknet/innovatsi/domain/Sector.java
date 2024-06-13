package com.schrecknet.innovatsi.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Sector implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String sector;
	private Date date;
	private List<String> heat;
	private List<String> humidity;
	private String message;

	public Sector(Date date, String message){
		this.date = date;
		this.message = message;
	}
}
