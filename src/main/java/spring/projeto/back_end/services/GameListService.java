package spring.projeto.back_end.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.projeto.back_end.dto.GameDTO;
import spring.projeto.back_end.dto.GameListDTO;
import spring.projeto.back_end.dto.GameMinDTO;
import spring.projeto.back_end.entities.Game;
import spring.projeto.back_end.entities.GameList;
import spring.projeto.back_end.repository.GameListRepository;
import spring.projeto.back_end.repository.GameRepository;
import java.util.stream.Collectors;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)

	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO (x)).toList();
		
		return dto;
	}
	

}
