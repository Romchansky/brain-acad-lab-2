package ua.zp.brainacad;

import static ua.zp.brainacad.MoneyTransactionUtil.sendTo;

public class UserBank {
    public static void main(String[] args) {

        // реализация нормального перевода средств
        try {
            sendTo(1214, 1213, 500);
        } catch (RuntimeException e) {
            System.out.println("При обработке транзакции произошла ошибка\n");

            //реализация с ошибкой номеров карт
        }
        try {
            sendTo(1214, 1214, 500);
        } catch(AccountException e){
            System.out.println("\nОшибка с реквизитами банка.Возможно, номер карты отправителя и получателя совпадают.\n");
            } catch (MoneyValueException e) {
            System.out.println("\nОшибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать лимит в 100 000\n");
        }
        //реализация когда сумму больше 100000

        try {
            sendTo(1214, 1214, 100_001);
        } catch (RuntimeException e) {
            System.out.println("При обработке транзакции произошла ошибка\n");

            //реализация отрицательной суммы
        } try {
            sendTo(1214, 1213, -100);
        } catch(AccountException e){
            System.out.println("Ошибка с реквизитами банка.Возможно, номер карты отправителя и получателя совпадают.\n");
        } catch (MoneyValueException e) {
            System.out.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать лимит в 100 000\n");
        }



    }
}
