package learing;

public class TestUser {
    private String id;
    private String username;
    private String password;

    public TestUser() {
    }
    public TestUser(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public String getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String toString() {
        return "TestUser [id=" + id + ", username=" + username + ", password=" + password + "]";
    }




}
