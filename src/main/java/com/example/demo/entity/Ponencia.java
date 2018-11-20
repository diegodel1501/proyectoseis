package com.example.demo.entity;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ponencia")
public class Ponencia {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPonencia;
	private Long idCatPonencia;
	private Long idexpocitor;
	private String nombre;
	private Time horaInicio;
	private Time horaTermino;
	public Long getIdPonencia() {
		return idPonencia;
	}
	public void setIdPonencia(Long idPonencia) {
		this.idPonencia = idPonencia;
	}
	public Long getIdCatPonencia() {
		return idCatPonencia;
	}
	public void setIdCatPonencia(Long idCatPonencia) {
		this.idCatPonencia = idCatPonencia;
	}
	public Long getIdexpocitor() {
		return idexpocitor;
	}
	public void setIdexpocitor(Long idexpocitor) {
		this.idexpocitor = idexpocitor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Time getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Time getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(Time horaTermino) {
		this.horaTermino = horaTermino;
	}
	
}
