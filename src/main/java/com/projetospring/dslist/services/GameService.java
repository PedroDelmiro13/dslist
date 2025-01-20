package com.projetospring.dslist.services;
import java.util.List;

import com.projetospring.dslist.DTO.GameMinDTO;
import com.projetospring.dslist.entities.Game;
import com.projetospring.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        var result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
