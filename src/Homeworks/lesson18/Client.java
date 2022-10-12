package Homeworks.lesson18;

abstract class Client {

    private double money = 10.0;

    public double getMoney() {
        return money;
    }

    public void putMoney(double money){
        if (money > 0) {
            this.money += money;
            System.out.println("Вы положили на счет: " + money + "$" + " \nВаш баланс: " + this.money + "$");
        }
    }

    public void takeMoney(double money){
        if (this.money != 0 && this.money >= money){
            this.money -= money;
            System.out.println("Вы сняли с баланса: " + money + "$"+ "\nВаш баланс: " + this.money + "$");
        }
    }

    public void actualBalance(){
        System.out.println("Ваш баланс: " + money + "$");
    }

   public abstract void balanceInfo();

}
