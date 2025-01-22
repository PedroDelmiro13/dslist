package com.projetospring.dslist.DTO;
import com.projetospring.dslist.entities.Game;
import com.projetospring.dslist.entities.GameList;
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO() {
    }
    public GameListDTO(GameList entity) {
        id= entity.getId();
        name= entity.getName();
    }

    public GameListDTO(Game game) {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
