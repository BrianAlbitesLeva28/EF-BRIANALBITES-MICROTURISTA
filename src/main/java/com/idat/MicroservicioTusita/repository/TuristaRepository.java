package com.idat.MicroservicioTusita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MicroservicioTusita.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer> {

}
