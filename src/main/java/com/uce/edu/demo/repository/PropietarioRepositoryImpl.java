package com.uce.edu.demo.repository;

import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Propietario;
@Service
public class PropietarioRepositoryImpl implements IPropietarioRepository{
	
	
	
	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("se inserto un propietario: "+p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("se elimino la persona con cedula: "+cedula);
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Propietario p = new Propietario();
		p.setApellido("Benavides");
		p.setCedula(cedula);
		p.setNombre("Andres");
		
		return p;
	}

}
