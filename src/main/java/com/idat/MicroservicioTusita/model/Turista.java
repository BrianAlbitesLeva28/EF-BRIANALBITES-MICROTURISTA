package com.idat.MicroservicioTusita.model;

import lombok.Data;

@Data
public class Turista {
	
	private Integer idTurista;
	private String nombreTurista;
	private Integer numCelular;
	private String direccion;

}
