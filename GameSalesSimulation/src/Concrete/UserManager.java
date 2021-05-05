package Concrete;

import java.util.ArrayList;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.GameLibrary;
import Entities.User;

public class UserManager implements UserService{
	
	private UserCheckService _userCheckService;
	private ArrayList<GameLibrary> _games;
	
	public UserManager(UserCheckService userCheckService) {
		this._userCheckService = userCheckService;
		this._games= new ArrayList<GameLibrary>();
	}


	@Override
	public void add(User user) throws Exception {
		if (_userCheckService.checkIfRealPerson(user)) {
			System.out.println(user.getUserName()+" Kullan�c� Eklendi");
		} else {
			throw new Exception("Not a valid person");
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUserName()+" Kullan�c� Bilgileri G�ncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName()+" Kay�t Silindi");
		
	}

	@Override
	public void getGames(User user) {
		System.out.println(user.getUserName()+" Alm�� Oldu�unuz Oyunlar");
		for(GameLibrary game:_games) {
			System.out.println(" * "+game.getGameName());
		}
		
	}

	@Override
	public void addGames(User user, GameLibrary game) {
		this._games.add(game);
		System.out.println(user.getUserName()+" Taraf�ndan "+
		game.getGameName()+" Sat�n Al�nd�.");
		
	}
	
}
