package Models;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class User {
    static User instance;
    private String username;

public static User getInstance() {
    if(instance == null){
        instance = new User();
    }
    return instance;
}
    private User(){
    }

    public String getUsername() {
        return username;
    }

    public void login(String username) {

        if(username.equals("Manolo")){
            System.out.println(username);
            this.username = username;
        }
    }
    public Boolean isLogged(){
    if(username != null) return true;
    return false;
    }
    public void logout(){
    this.username = null;
    }
}
