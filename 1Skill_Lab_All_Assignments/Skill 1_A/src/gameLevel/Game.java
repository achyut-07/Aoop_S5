package gameLevel;

public class Game {
    private static Game instance;
    
    private int currentGameLevel;
    private String gameDifficulty;
    private int score;
    private int heroLife;
    
    private Game(){
    	currentGameLevel=0;
    	gameDifficulty="Easy";
    	score=0;
    	heroLife=100;
    }
    
    public static Game getInstance() {
    	if(instance==null) instance=new Game();
    	return instance;
    }
    
    public void setcurrentGameLevel(int currentGameLevel) {
    	this.currentGameLevel=currentGameLevel;
    }
    public int getcurrentGameLevel() {
    	return currentGameLevel;
    }
    
    public void setgameDifficulty(String gameDifficulty) {
    	this.gameDifficulty=gameDifficulty;
    }
    
    public String getgameDifficulty() {
    	return gameDifficulty;
    }
    
    public void setscore(int score) {
    	this.score=score;
    }
    
    public int getscore() {
    	return score;
    }
    
    public void setheroLife(int heroLife) {
    	this.heroLife=heroLife;
    }
    
    public int getheroLife() {
    	return heroLife;
    }
}
