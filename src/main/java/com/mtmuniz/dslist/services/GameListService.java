package com.mtmuniz.dslist.services;

import com.mtmuniz.dslist.dto.GameListDTO;
import com.mtmuniz.dslist.dto.GameMinDTO;
import com.mtmuniz.dslist.entities.GameList;
import com.mtmuniz.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
