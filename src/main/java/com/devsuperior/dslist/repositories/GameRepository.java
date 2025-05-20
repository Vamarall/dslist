package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

// <Tipo_Entidade, Tipo_ID_Entidade>
public interface GameRepository extends JpaRepository<Game, Long>{

}
