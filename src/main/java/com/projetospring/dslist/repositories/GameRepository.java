package com.projetospring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetospring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
