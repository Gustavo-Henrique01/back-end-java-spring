package spring.projeto.back_end.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.projeto.back_end.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long > {

}
