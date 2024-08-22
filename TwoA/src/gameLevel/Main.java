package gameLevel;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Game g=Game.getInstance();
		g.setcurrentGameLevel(1);
		System.out.println("Enter you difficulty choice");
        System.out.println("1.Easy");
        System.out.println("2.Medium");
        System.out.println("3.Hard");
        int n=sc.nextInt();
        
        switch (n) {
        case 1: g.setgameDifficulty("Easy");
                break;
        case 2: g.setgameDifficulty("Medium");
                break;
        case 3: g.setgameDifficulty("Hard");
                break;
        }
        EnemyFactory eF=null;
        ItemGameFactory iF=null;
        switch (g.getgameDifficulty()) {
        case "Easy": eF = new EasyEnemyfactory();
                     iF = new EasyItemFactory();
                     break;
        case "Medium": eF= new MediumEnemyFactory();
                       iF = new MediumItemFactory(); 
                       break;
        case "Hard": eF = new HardEnemyFactory();
                     iF = new HardItemFactory();
                     break;
     }
      
        Enemy enemy = eF.createEnemy();
        enemy.attack();

        Weapon weapon = iF.createWeapon();
        Powerup powerUp = iF.createPowerUp();

        weapon.Equip();
        powerUp.boost();
        
	}

}
