package com.idat.MicroservicioTusita.service;

import java.util.List;

import com.idat.MicroservicioTusita.model.Turista;

public interface TuristaService {
	
	List<Turista> listar();
	Turista obtenerId(Integer id);
	void guardar(Turista alumno);
	void actualizar(Turista alumno);
	void eliminar(Integer id);

}
