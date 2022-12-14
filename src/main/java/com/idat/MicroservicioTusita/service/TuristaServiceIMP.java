package com.idat.MicroservicioTusita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MicroservicioTusita.model.Turista;
import com.idat.MicroservicioTusita.repository.TuristaRepository;

@Service
public class TuristaServiceIMP implements TuristaService {
	
	@Autowired
	private TuristaRepository repository;

	@Override
	public List<Turista> listar() {
		return repository.findAll();
	}

	@Override
	public Turista obtenerId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Turista turista) {
		repository.save(turista);
		
	}

	@Override
	public void actualizar(Turista turista) {
		repository.saveAndFlush(turista);
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
		
	}

}
