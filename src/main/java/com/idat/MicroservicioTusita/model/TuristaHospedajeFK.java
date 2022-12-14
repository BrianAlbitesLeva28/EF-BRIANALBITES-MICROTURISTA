package com.idat.MicroservicioTusita.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class TuristaHospedajeFK implements Serializable {

	private static final long serialVersionUID = -519923481496792773L;
	
	@Column(name = "id_turista", nullable = false, unique = true)
	private Integer idTurista;
	
	@Column(name = "id_hospedaje", nullable = false, unique = true)
	private Integer idHospedaje;
	

}
