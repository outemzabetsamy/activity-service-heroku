package com.sw.activite.entity;

import java.sql.Blob;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
@Entity
public class Activite {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
	@Column
private String nomActivite;
	
	@Column
private String photoActivite;
	@Column
private String descriptionActivite;
	@Column
private String numeroTelephone;
public Activite() {
	super();
	// TODO Auto-generated constructor stub
}
public Activite(Long id, String nomActivite, String photoActivite, String descriptionActivite,String numeroTelephone) {
	super();
	this.id = id;
	this.nomActivite = nomActivite;
	this.photoActivite = photoActivite;
	this.descriptionActivite = descriptionActivite;
	this.numeroTelephone = numeroTelephone;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNomActivite() {
	return nomActivite;
}
public void setNomActivite(String nomActivite) {
	this.nomActivite = nomActivite;
}
public String getPhotoActivite() {
	return photoActivite;
}
public void setPhotoActivite(String photoActivite) {
	this.photoActivite = photoActivite;
}
public String getDescriptionActivite() {
	return descriptionActivite;
}
public void setDescriptionActivite(String descriptionActivite) {
	this.descriptionActivite = descriptionActivite;
}
public String getNumeroTelephone() {
	return numeroTelephone;
}
public void setNumeroTelephone(String numeroTelephone) {
	this.numeroTelephone = numeroTelephone;
}

}
