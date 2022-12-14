package com.idat.MicroservicioTusita.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "detalle_turista")
public class TuristaDetalle {
	
	@Id
	private TuristaHospedajeFK fk = new TuristaHospedajeFK();
	
	private String pais;

}
