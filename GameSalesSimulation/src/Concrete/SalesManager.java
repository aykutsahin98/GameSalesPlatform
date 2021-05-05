package Concrete;

import Abstract.DiscountService;
import Abstract.SalesService;
import Abstract.UserService;
import Entities.Discount;
import Entities.GameLibrary;
import Entities.User;

public class SalesManager implements SalesService {
	
	private UserService _userService;
	private DiscountService _discountService;
	
	public SalesManager(UserService _userService) {
		this._userService = _userService;
	}

	public SalesManager(UserService _userService, DiscountService discountService) {
		this._discountService = discountService;
		this._userService = _userService;
	}

	@Override
	public void control(GameLibrary game, User user) {
		_userService.addGames(user, game);
		
	}

	@Override
	public void control(GameLibrary game, User user, Discount discount) {
		if (_discountService.validate(discount)) {
			game.setPrice(game.getPrice() - (game.getPrice() * discount.getDiscountPercent()));
			_userService.addGames(user, game);
		} else
			System.out.println("Kampanya süresi bitmiþtir.Satýþ iþlemi baþarýsýz.");
	}
}

