package model;

public class Client {
    private String name;
    private String user;
    private String email;
    private String pass;
    private int age;
    private int id;
    
    public Client(int id, String name, String user, String email, String pass, int age) {
        this.id = id;        
        this.name = name;
        this.user = user;
        this.email = email;
        this.pass = pass;
        this.age = age;
    }
    
    public Client(int id) {
        this.id = id;
        this.name = "";
        this.user = "";
        this.email = "";
        this.pass = "";
        this.age = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
