package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.repository.IPropietarioRepository;
import com.uce.edu.demo.service.IMatriculaGestorService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class CorreccionPruebaPaP2Ab1Application implements CommandLineRunner{
	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioRepository propietarioRepository;
	@Autowired
	private IMatriculaGestorService matriculaGestorService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CorreccionPruebaPaP2Ab1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//insertar vehiculo
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Toyota");
		vehiculo.setPlaca("PCT1234");
		vehiculo.setPrecio(new BigDecimal(50000));
		vehiculo.setTipo("P");
		this.vehiculoService.insertar(vehiculo);
		//actualizar vehiculo
		vehiculo.setMarca("Toyota");
		this.vehiculoService.actializar(vehiculo);
		//ingresar un propietario
		Propietario p = new Propietario();
		p.setApellido("Benavides");
		p.setNombre("Andres");
		p.setCedula("1209876543");
		this.propietarioRepository.insertar(p);
		//matricular un vehiculo con propietario
		this.matriculaGestorService.generar(p.getCedula(), vehiculo.getPlaca());
		
		
	
		
	}

}
