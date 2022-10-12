package Homeworks.lesson18;

public class LegalPerson extends Client{

    @Override
    public void balanceInfo() {
        System.out.println("Для юридических лиц — снятие с комиссией 1% ");
    }
    @Override
    public void takeMoney(double money){
        super.takeMoney(money + money/100);
    }
}
