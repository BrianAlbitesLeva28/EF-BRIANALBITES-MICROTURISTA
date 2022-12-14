package com.idat.MicroservicioTusita.service;

import java.util.List;

import com.idat.MicroservicioTusita.model.Turista;

public interface TuristaService {
	
	List<Turista> listar();
	void guardar(Turista alumno);

}
