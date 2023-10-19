package classandobject;

public class User {
    //State => Username , Email , Role , Password
     public String Username; //use public
    private String Email; //use private
     protected String Role; // use protected
    String Password;    //use default
    //Bahavior =>  Register and GetInfo

    public void register(String name, String email, String role , String password ){
        Username = name ;
        Email = email;
        Role = role ;
        Password = password;
    }
    public void getinfo(){
        System.out.println("Name  : "+Username);
        System.out.println("Email : "+ Email);
        System.out.println("Role  : "+Role);
        System.out.println("Password : "+Password);
    }
}
