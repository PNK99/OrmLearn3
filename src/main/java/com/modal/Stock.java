package com.modal;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity()
public class Stock implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String st_id;
	
	@Column(name="st_code")
	private String code;
	
	@Column(name = "st_date")
	private Date date;
	
	@Column(name="st_open")
	private Double open;
	
	@Column(name="st_close")
	private Double close;
	
	@Column(name="st_volume")
	private Integer volume;

	public String getSt_id() {
		return st_id;
	}

	public void setSt_id(String st_id) {
		this.st_id = st_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getOpen() {
		return open;
	}

	public void setOpen(Double open) {
		this.open = open;
	}

	public Double getClose() {
		return close;
	}

	public void setClose(Double close) {
		this.close = close;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Stock [st_id=" + st_id + ", date=" + date + ", open=" + open + ", close=" + close + ", volume=" + volume
				+ "]";
	}
	
	
}
