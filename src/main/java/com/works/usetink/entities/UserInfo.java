package com.works.usetink.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int uid;
	private String key128Bit;
	private String ciphertext;
	private String associatedData;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getKey128Bit() {
		return key128Bit;
	}
	public void setKey128Bit(String key128Bit) {
		this.key128Bit = key128Bit;
	}
	public String getCiphertext() {
		return ciphertext;
	}
	public void setCiphertext(String ciphertext) {
		this.ciphertext = ciphertext;
	}
	public String getAssociatedData() {
		return associatedData;
	}
	public void setAssociatedData(String associatedData) {
		this.associatedData = associatedData;
	}

	
}
