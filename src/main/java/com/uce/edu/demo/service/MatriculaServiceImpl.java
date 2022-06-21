package com.uce.edu.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.repository.IPropietarioRepository;
import com.uce.edu.demo.repository.IVehiculoRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IPropietarioRepository propietarioRepository;
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	
	
	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Vehiculo v = this.vehiculoRepository.buscar(placa);
		Propietario p = this.propietarioRepository.buscar(cedula);
		BigDecimal valorMatricula = null;
		
		
		if (v.getTipo()== "L"  && v.getPrecio().intValue() >= 2000) {
			
			valorMatricula = v.getPrecio().multiply(new BigDecimal(12)).divide(new BigDecimal(100));
			mostrar(p,v,valorMatricula);
			
			
		}else if (v.getTipo() == "P") {
			valorMatricula = v.getPrecio().multiply(new BigDecimal(14)).divide(new BigDecimal(100));
			System.out.println("valor matricula");
			mostrar(p,v,valorMatricula);
			
		}
		
				
		if (v.getPrecio().intValue() >= 2000) {
			BigDecimal descuento = valorMatricula.multiply(new BigDecimal(7)).divide(new BigDecimal(100));
			valorMatricula = valorMatricula.subtract(descuento);
			mostrar(p,v,valorMatricula);
			
		}
			
			
		}



	@Override
	public void mostrar(Propietario p, Vehiculo v, BigDecimal valorMatricula) {

		System.out.println("precio de la matricula"+ valorMatricula +"propietario"+ p+"vehiculo"+v );
		
	}
		
	


}
