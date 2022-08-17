package com.gestion.mensajes.repositorio;

import com.gestion.mensajes.modelo.MensajeModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepositorio extends JpaRepository<MensajeModelo, Long> {
}
