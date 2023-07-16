package com.mtmuniz.dslist.repositories;

import com.mtmuniz.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
