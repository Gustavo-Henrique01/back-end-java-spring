package spring.projeto.back_end.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.projeto.back_end.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long > {

}
