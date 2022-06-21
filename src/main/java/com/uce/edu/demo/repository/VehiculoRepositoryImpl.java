package com.uce.edu.demo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {
	
	
	 @Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		 System.out.println("se inserto en la base el vehiculo: "+ v);
		
	}
	
	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("se actualizo en la base el veichulo: "+v);
		
	}

	@Override
	public Vehiculo buscar (String placa) {
		// TODO Auto-generated method stub
		System.out.println("se encontrro en la base en auto de placa: "+ placa);
		Vehiculo v = new Vehiculo();
		v.setMarca("chevrolet");
		v.setModelo("aveo");
		v.setPlaca(placa);
		v.setPrecio(new BigDecimal(2500));
		v.setTipo("L");
		return v;
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		
	}
	

}
