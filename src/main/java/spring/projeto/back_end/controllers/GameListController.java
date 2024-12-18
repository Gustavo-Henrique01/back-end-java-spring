package spring.projeto.back_end.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.projeto.back_end.dto.GameListDTO;
import spring.projeto.back_end.dto.GameMinDTO;
import spring.projeto.back_end.dto.ReplacementDTO;
import spring.projeto.back_end.services.GameListService;
import spring.projeto.back_end.services.GameService;

@RestController
@RequestMapping(value="/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService; 
	
	@Autowired
	private GameService gameService; 
	
	@GetMapping
	public List<GameListDTO> findAll() {
	    List<GameListDTO> result = gameListService.findAll();
	 
	    return result;
	}
	
	@GetMapping(value="/{listid}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listid) {
	    List<GameMinDTO> result = gameService.findByList(listid);

	    return result;
	}

	@PostMapping(value="/{listid}/replacement")
	public void move(@PathVariable Long listid, @RequestBody ReplacementDTO body) {
	   gameListService.move(listid,body.getSourceIndex(), body.getDestinationIndex());

	    
	}



}
