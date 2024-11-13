package spring.projeto.back_end.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.projeto.back_end.dto.GameMinDTO;
import spring.projeto.back_end.entities.Game;
import spring.projeto.back_end.repository.GameRepository;
import java.util.stream.Collectors;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO (x)).toList();
		
		return dto;
	}

}
