package com.uce.edu.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Matricula {
	private LocalDateTime fechaMatricula;
	private BigDecimal valorMAtricula;
	private Propietario popietario;
	private Vehiculo vehiculo;
	
	@Override
	public String toString() {
		return "Matricula [fechaMatricula=" + fechaMatricula + ", valorMAtricula=" + valorMAtricula + ", popietario="
				+ popietario + ", vehiculo=" + vehiculo + "]";
	}
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValorMAtricula() {
		return valorMAtricula;
	}
	public void setValorMAtricula(BigDecimal valorMAtricula) {
		this.valorMAtricula = valorMAtricula;
	}
	public Propietario getPopietario() {
		return popietario;
	}
	public void setPopietario(Propietario popietario) {
		this.popietario = popietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	

}
