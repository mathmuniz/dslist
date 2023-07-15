package com.mtmuniz.dslist.repositories;

import com.mtmuniz.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
