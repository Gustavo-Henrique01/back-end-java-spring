package spring.projeto.back_end.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.projeto.back_end.dto.GameDTO;
import spring.projeto.back_end.dto.GameListDTO;
import spring.projeto.back_end.services.GameListService;

@RestController
@RequestMapping(value="/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService; 
	
	@GetMapping
	public List<GameListDTO> findAll() {
	    List<GameListDTO> result = gameListService.findAll();
	 
	    return result;
	}



}