package spring.projeto.back_end.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable //encapsulamento do game_id e list_id
public class BelongingPK {
	
	@ManyToOne
    @JoinColumn(name = "game_id")
	private Game Game ;
	
	 @ManyToOne
	 @JoinColumn(name = "list_id")
	private GameList list ;
	
	
	public BelongingPK(GameList list, Game game) {
		
		this.list = list;
		this.Game = game;
	}

	public BelongingPK() {
	
	}

	public GameList getList() {
		return list;
	}

	public void setList(GameList list) {
		this.list = list;
	}

	public Game getGame() {
		return Game;
	}

	public void setGame(Game game) {
		Game = game;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Game, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(Game, other.Game) && Objects.equals(list, other.list);
	}
	
	
}
