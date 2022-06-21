package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	
	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("se inserto en la base el propietario: "+ p);
		
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("se encontro el propietario con cedula: "+ cedula);
		Propietario p = new Propietario();
		p.setApellido("Benavides");
		p.setNombre("Andres");
		p.setCedula(cedula);
		return p;
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		
	}
	
	
}
