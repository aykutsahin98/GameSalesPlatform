package Abstract;

import Entities.*;

public interface SalesService {
	
	void control(GameLibrary game,User user);
	void control(GameLibrary game,User user,Discount discount);
}
