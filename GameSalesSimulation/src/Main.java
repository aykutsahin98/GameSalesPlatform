import java.util.Date;

import Concrete.*;
import Entities.*;
import MernisAdapter.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		UserManager userManager = new UserManager(new MernisService());
		User userAykut = new User(1,"ayktsahn98","12345","Aykut","Þahin","11122266652",new Date(1998,7,23));
		userManager.add(userAykut);
		System.out.println("\n");
		System.out.println("---------------GAME LIBRARY---------------");
		GameManager gameManager= new GameManager();
		GameLibrary gameSims= new GameLibrary(1,"The Sims",150);
		GameLibrary gameCs6= new GameLibrary(1,"Counter Strike",50);
		GameLibrary gameCraft= new GameLibrary(1,"Minecraft",250);
		GameLibrary gameBattle= new GameLibrary(1,"BattleShip",350);
		gameManager.addMultiple(new GameLibrary[] {gameSims,gameBattle,gameCraft,gameCs6});
		System.out.println("\n");
		System.out.println("---------------DISCOUNT INFOS---------------");
		DiscountManager discountManager= new DiscountManager();
		Discount discountSpring=new Discount("Bahar",10,new Date(2021,5,8));
		Discount discountWinter=new Discount("Ara Tatil",15,new Date(2021-1998,6,7));
		discountManager.add(discountSpring);
		discountManager.add(discountWinter);
		System.out.println("\n");
		System.out.println("---------------SALES INFOS---------------");
		SalesManager salesManager= new SalesManager(userManager,discountManager);
		salesManager.control(gameSims, userAykut, discountSpring);
		salesManager.control(gameBattle, userAykut, discountWinter);
		salesManager.control(gameCraft, userAykut, discountSpring);
		salesManager.control(gameCs6, userAykut, discountWinter);
		System.out.println();
		userManager.getGames(userAykut);
		

	}

}
