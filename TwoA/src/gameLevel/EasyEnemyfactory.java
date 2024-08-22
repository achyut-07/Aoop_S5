package gameLevel;

public class EasyEnemyfactory extends EnemyFactory{

	@Override
	public Enemy createEnemy() {
		return new EasyEnemy();
	}

}
