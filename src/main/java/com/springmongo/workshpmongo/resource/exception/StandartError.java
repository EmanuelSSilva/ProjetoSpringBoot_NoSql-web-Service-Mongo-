package com.springmongo.workshpmongo.resource.exception;

import java.io.Serializable;

public class StandartError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long timestamp;
	private Integer status;
	private String erro;
	private String messege;
	private String path;
	
	public StandartError() {
		
	}

	public StandartError(Long timestamp, Integer status, String erro, String messege, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.erro = erro;
		this.messege = messege;
		this.path = path;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
