package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void insertar(Vehiculo vehiculo);
	public Vehiculo buscar (String placa);
	public void eliminar (String placa);
	public void actializar (Vehiculo vehiculo);
}
