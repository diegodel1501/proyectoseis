package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="expositor")// notar la minuscula para la diferenciacion con la clase
public class Expositor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)// establecemos a id como auto incremental con el comentario
	private Long IdExpositor;
	private String nombre;
	private char sexo;
	private  String correo;
	private Long  fono;
	public Long getIdExpositor() {
		return IdExpositor;
	}
	public void setIdExpositor(Long idExpocitor) {
		IdExpositor = idExpocitor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Long getFono() {
		return fono;
	}
	public void setFono(Long fono) {
		this.fono = fono;
	}
	

}
