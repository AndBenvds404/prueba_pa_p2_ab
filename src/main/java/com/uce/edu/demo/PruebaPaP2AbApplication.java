package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IMatriculaService;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2AbApplication implements CommandLineRunner{
	
	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private IPropietarioService propietarioService;
	
	@Autowired
	private IMatriculaService matriculaService;
	

	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2AbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		// creacion de nuevo vehiculo
		Vehiculo v1 = new Vehiculo();
		v1.setMarca("chevrolet");
		v1.setModelo("aveo");
		v1.setPlaca("PDG123");
		v1.setPrecio(new BigDecimal(1500));
		v1.setTipo("L");
		this.vehiculoService.crear(v1);
		
		//actualizacion del vehiculo
		v1.setPrecio(new BigDecimal(2500));
		this.vehiculoService.actualizar(v1);
		
		
		//crearcion de nuevo propietario
		Propietario p1 = new Propietario();
		p1.setNombre("Andres");
		p1.setApellido("Benavides");
		p1.setCedula("1712345678");
		this.propietarioService.crear(p1);
		
		
		
		this.matriculaService.Matricular("1712345678", "PDG123");
		
		
	}

}
