package gameLevel;

public class HardItemFactory extends ItemGameFactory {

	@Override
	public Weapon createWeapon() {
		return new Snipper();
	}

	@Override
	public Powerup createPowerUp() {
		return new Shield();
	}

}
