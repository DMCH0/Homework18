package Homeworks.lesson18;

public class Main {
    public static void main(String[] args) {

        Client individualEntrepreneur = new IndividualEntrepreneur();
      individualEntrepreneur.balanceInfo();
      individualEntrepreneur.actualBalance();
      individualEntrepreneur.putMoney(1000);
      individualEntrepreneur.takeMoney(20);
    }
}
