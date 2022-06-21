package com.uce.edu.demo.service;

import java.math.BigDecimal;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;

public interface IMatriculaService {
	
	public void matricular (String cedula, String placa);
	
	public void mostrar(Propietario p, Vehiculo v, BigDecimal valorMatricula);

}
