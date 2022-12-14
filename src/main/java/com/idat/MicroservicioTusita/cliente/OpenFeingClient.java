package com.idat.MicroservicioTusita.cliente;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.MicroservicioTusita.DTO.HospedajeDTO;

@FeignClient(name = "hospedaje-microservicio", url = "localhost:8070")
public interface OpenFeingClient {
	
	@GetMapping("/api/hospedaje/v1/listar")
	public List<HospedajeDTO> listarHospedaje();

}
