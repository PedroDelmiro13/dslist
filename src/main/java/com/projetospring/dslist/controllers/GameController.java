package com.projetospring.dslist.controllers;

import java.util.List;

import com.projetospring.dslist.DTO.GameMinDTO;
import com.projetospring.dslist.entities.Game;
import com.projetospring.dslist.services.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO>  result = gameService.findAll();
        return result;
    }
}
