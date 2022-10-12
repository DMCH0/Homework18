package Homeworks.lesson18;

public class IndividualEntrepreneur extends Client {
    @Override
    public void balanceInfo() {
        System.out.println("Для ИП — пополнение с комиссией 1%, если сумма меньше 1000 $.\nКомиссия 0,5% если сумма больше либо равна 1000 $.");
    }

    @Override
    public void putMoney(double money) {
        if (money >= 1000) {
            super.putMoney(money - money / 200);
        } else {
            super.putMoney(money - money / 100);
        }
    }
}
