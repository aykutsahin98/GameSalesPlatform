package Concrete;

import Abstract.GameService;
import Entities.GameLibrary;

public class GameManager implements GameService {

	public GameManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(GameLibrary game) {
		System.out.println(game.getGameName() + " oyunu kütüphaneye eklendi");
		
	}

	@Override
	public void update(GameLibrary game) {
		System.out.println(game.getGameName() + " oyun bilgisi güncellendi");
		
	}

	@Override
	public void delete(GameLibrary game) {
		System.out.println(game.getGameName() + " oyun kütüphaneden silindi");
		
	}

	@Override
	public void addMultiple(GameLibrary[] games) {
		for(GameLibrary game : games) {
			add(game);
		}
		
	}

}
