import java.util.ArrayList;

public class Store {

    private String shopName;
    private String url;
    private ArrayList<User> userList;
    private User authorizationUser;

    public Store(String shopName, String url, ArrayList<User> userList) {
        this.shopName = shopName;
        this.url = url;
        this.userList = userList;
    }

    public Store() {
    }



    public boolean login(String login, String password) {
        for (User user : userList) {
            if (user.isLoginCorrect(login)) {
                if (user.isPasswordCorrect(password)) {
                    authorizationUser = user;
                    System.out.println("Авторизация прошла успешно");
                    return true;
                } else {
                    System.out.println("Логин/пароль не подходит");
                }
            }
        }
            System.out.println("Введены неверные данные");
            return false;
    }

        void getCurrentUserRights () {

            switch (authorizationUser.getRole()) {
                case UNKNOWN:
                    System.out.println("Анонимный пользователь, может покупать товары и/или авторизоваться");
                    break;
                case MANAGER:
                    System.out.println("Менеджер магазина, может общаться с клиентами");
                    break;
                case CLIENT:
                    System.out.println("Клиент магазина, может покупать товары и пользоваться дисконтом");
                    break;
                case DIRECTOR:
                    System.out.println("Директор магазина, может управлять кадрами, и ценами");
                    break;
                case ADMINISTRATOR:
                    System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
                    break;
                default:
                    System.out.println("Error");
            }
        }


        public void logout () {
            authorizationUser = null;
            System.out.println("Пользователь вышел из системы");

        }
    }



