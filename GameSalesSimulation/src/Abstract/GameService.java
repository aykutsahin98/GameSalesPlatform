package Abstract;

import Entities.GameLibrary;

public interface GameService {
	
	void add(GameLibrary game);

	void update(GameLibrary game);

	void delete(GameLibrary game);

	void addMultiple(GameLibrary[] games); //coklu oyun ekleme
}
