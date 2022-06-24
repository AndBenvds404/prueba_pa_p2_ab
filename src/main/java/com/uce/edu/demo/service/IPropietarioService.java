package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Propietario;

public interface IPropietarioService {
	
	public void insertar (Propietario p);
	public void eliminar (String cedula);
}
