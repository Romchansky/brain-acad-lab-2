
public class User {
    String login;
    String password;
    String name;
    EmployeePositions role = EmployeePositions.UNKNOWN;

    public User(String login, String password, String name, EmployeePositions role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }



    public User() {
    }

    public EmployeePositions getRole() {
        return role;
    }

    public void setRole(EmployeePositions role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }


    protected boolean isLoginCorrect(String login) {
        return login.equals(this.login);
    }

    protected boolean isPasswordCorrect(String password) {
        return password.equals(this.password);
    }

}
