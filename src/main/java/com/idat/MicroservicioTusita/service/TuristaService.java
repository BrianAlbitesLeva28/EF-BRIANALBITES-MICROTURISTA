package com.idat.MicroservicioTusita.service;

import java.util.List;

import com.idat.MicroservicioTusita.DTO.TuristaDTO;

public interface TuristaService {
	
	List<TuristaDTO> listar();
	void guardar(TuristaDTO turista);

}
