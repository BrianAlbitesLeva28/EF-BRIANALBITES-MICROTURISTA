package com.idat.MicroservicioTusita.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MicroservicioTusita.DTO.TuristaDTO;
import com.idat.MicroservicioTusita.model.Turista;
import com.idat.MicroservicioTusita.repository.TuristaRepository;

@Service
public class TuristaServiceIMP implements TuristaService {
	
	@Autowired
	private TuristaRepository repository;

	@Override
	public List<TuristaDTO> listar() {
		
		List<TuristaDTO> listadto = new ArrayList<>();
		TuristaDTO dto = null;
		
		for (Turista turista : repository.findAll()) {
			dto = new TuristaDTO();
			dto.setCodigo(turista.getIdTurista());
			dto.setNombre(turista.getNombreTurista());
			dto.setCelular(turista.getNumCelular());
			dto.setDirec(turista.getDireccion());
			listadto.add(dto);
		}
		
		return listadto;
	}

	@Override
	public void guardar(TuristaDTO turista) {
		Turista tur = new Turista();
		tur.setIdTurista(turista.getCodigo());
		tur.setNombreTurista(turista.getNombre());
		tur.setNumCelular(turista.getCelular());
		tur.setDireccion(turista.getDirec());
		
		repository.save(tur);		
	}

}
