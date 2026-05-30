package May26.Encapsulation;

public class Login {

    private String username;
    private String password;


    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void loginToApp(String username, String password) {
        if (username.equalsIgnoreCase(this.username) && password.equals(this.password)) {
            System.out.println("Login Successful");
        }else  {
            System.out.println("Login Failed");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
