package bankingService;


public class loginStatus {
	private static loginStatus instance;
    private boolean isPresent=false;
    private String userName;
    
    private loginStatus() {
    	
    }
    public static loginStatus getInstance(){
        if (instance == null) instance = new loginStatus();
        return instance;
    }
    
    public void login(String userName) {
    	if(!isPresent) {
    		this.userName=userName;
    		isPresent=true;
    		System.out.println(userName+" Logged in Sucessfully");
    	}
    	else {
    		System.out.println("Already a user exisits in the server wait for them to logout");
    	}
    }
    
    public void logout(){
        if (isPresent){
            System.out.println( userName+" Logged out.");
            isPresent=false;
            userName=null;
        } 
        else{
            System.out.println("No user is currently logged in.");
        }
    }
    public boolean isLoggedIn(){
        return isPresent;
    }

    public String getUsername(){
        return userName;
    }
}
