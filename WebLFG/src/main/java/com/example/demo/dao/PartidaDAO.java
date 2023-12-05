package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Partida;

@Repository
public interface PartidaDAO extends JpaRepository<Partida, Long> {

}

