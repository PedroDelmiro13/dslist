package com.projetospring.dslist.services;

import java.util.List;

import com.projetospring.dslist.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetospring.dslist.DTO.GameListDTO;
import com.projetospring.dslist.entities.GameList;
import com.projetospring.dslist.repositories.GameListRepository;
import com.projetospring.dslist.repositories.GameRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }

}

