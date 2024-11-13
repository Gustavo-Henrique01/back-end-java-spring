package spring.projeto.back_end.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.projeto.back_end.dto.GameDTO;
import spring.projeto.back_end.dto.GameMinDTO;
import spring.projeto.back_end.entities.Game;
import spring.projeto.back_end.repository.GameRepository;
import spring.projeto.back_end.repository.projections.GameMinProjection;

import java.util.stream.Collectors;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)

	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO (x)).toList();
		
		return dto;
	}
	@Transactional(readOnly = true)
	public GameDTO findbyid(Long id) {
		 Game result = gameRepository.findById(id).get();
		 GameDTO dto = new GameDTO (result);
		
		return dto;
	}
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList (Long listid) {
		List<GameMinProjection> result = gameRepository.searchByList(listid);
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO (x)).toList();
		
		return dto;
	}
	

}
