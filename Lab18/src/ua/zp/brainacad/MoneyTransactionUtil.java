package ua.zp.brainacad;

import static java.util.Objects.isNull;

public class MoneyTransactionUtil {

    private MoneyTransactionUtil() {
    }

    public static void sendTo(int numberCard1, int numberCard2, int sumValue) throws AccountException,MoneyValueException{
        if (numberCard1 == numberCard2) {
            throw new AccountException("Номера карт совпадают");
        }
        if (isNull(sumValue))
            throw new MoneyValueException("Поле суммы недолжно быть пустым");
            if (sumValue <= -0)
                throw new MoneyValueException("Сумма не должна быть 0 или отрицательна");
                if (sumValue > 100_000) {
                    throw new MoneyValueException("Сумма не должна быть больше 100000");
                }
        System.out.println("Сумма: " + sumValue + " $ " + " снята с карты №: " + numberCard1 + " переведена на карту №: " + numberCard2);
    }
}
