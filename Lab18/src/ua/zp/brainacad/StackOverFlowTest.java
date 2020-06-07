package ua.zp.brainacad;

public class StackOverFlowTest {
    static int count;

    public static void main(String[] args) {

        test();

    }
    static void test(){
        try{
            System.out.println(count++);
            test();
        }catch (StackOverflowError error){
            System.out.println("Ошибка переполнения стека. Рекурсия");
        }

    }
}
