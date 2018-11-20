package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="producto")
public class Producto {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idProducto;
private String nombre;
private Long precio;
private Date fecha;

public Long getIdProducto() {
	return idProducto;
}
public void setIdProducto(Long id) {
	this.idProducto = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Long getPrecio() {
	return precio;
}
public void setPrecio(Long precio) {
	this.precio = precio;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}

}
