import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user0 = new User("DIRECTOR", "12qwerty34", "Jonh", EmployeePositions.DIRECTOR);
        User user1 = new User("ADMINISTRATOR", "12qwerty34", "Victor", EmployeePositions.ADMINISTRATOR);
        User user2 = new User("MANAGER", "12qwerty34", "Julia", EmployeePositions.MANAGER);
        User user3 = new User("CLIENT", "12qwerty34", "Roman", EmployeePositions.CLIENT);
        User user4 = new User("UNKNOWN", "12qwerty34", "Slavik", EmployeePositions.UNKNOWN);


        Store store = new Store("Silpo","https://silpo.ua/",addallUsers(user0,user1,user2,user3,user4));

        while (true) {
            tryLogin(store);
        }

    }

    public static void tryLogin(Store store) {
        System.out.println("Введите логин");
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        System.out.println("Введите пароль");
        String pass = sc.nextLine();
        store.login(login,pass);
        store.getCurrentUserRights();
        store.logout();
    }

    public static ArrayList<User> addallUsers(User...users){
        ArrayList<User> allUsers = new ArrayList<>(Arrays.asList(users));
        return allUsers;
    }


}
