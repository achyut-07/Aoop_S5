package gameLevel;

public class EasyItemFactory extends ItemGameFactory {

	@Override
	public Weapon createWeapon() {
		
		return new Pistol();
	}

	@Override
	public Powerup createPowerUp() {
		
		return new HealthPotion();
	}

}
