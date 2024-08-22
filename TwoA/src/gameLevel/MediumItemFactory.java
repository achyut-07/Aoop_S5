package gameLevel;

public class MediumItemFactory extends ItemGameFactory {

	@Override
	public Weapon createWeapon() {
		return new Shotgun();
	}

	@Override
	public Powerup createPowerUp() {
		return new Nightvision();
	}

}
