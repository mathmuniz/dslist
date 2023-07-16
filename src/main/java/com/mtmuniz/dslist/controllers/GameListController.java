package com.mtmuniz.dslist.controllers;

import com.mtmuniz.dslist.dto.GameListDTO;
import com.mtmuniz.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;



    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }
}
