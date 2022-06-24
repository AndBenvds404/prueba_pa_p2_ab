package com.uce.edu.demo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("se inserta un vehiculo: "+vehiculo);
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la placa"+ placa);
		Vehiculo v = new Vehiculo();
		v.setPlaca(placa);
		v.setMarca("Toyota");
		v.setTipo("L");
		v.setPrecio(new BigDecimal(1200));
		return v;
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("se elimino un vehiculo con placa: "+placa);
	}

	@Override
	public void actializar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("se actualiza un vehiculo: "+vehiculo);
		
	}


	
	
}
