package spring.projeto.back_end.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.projeto.back_end.dto.GameDTO;
import spring.projeto.back_end.dto.GameMinDTO;
import spring.projeto.back_end.entities.Game;
import spring.projeto.back_end.services.GameService;

@RestController
@RequestMapping(value="games")
public class GameController {
	
	@Autowired
	private GameService gameService; 
	
	@GetMapping
	public List<GameMinDTO> findAll() {
	    List<GameMinDTO> result = gameService.findAll();
	 
	    return result;
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findbyid(@PathVariable Long id) {
	    GameDTO result = gameService.findbyid(id);
	 
	    return result;
	}


}
