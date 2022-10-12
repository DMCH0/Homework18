package Homeworks.lesson18;

public class Main {
    public static void main(String[] args) {
        Client individualEntrepreneur = new IndividualEntrepreneur();
        individualEntrepreneur.balanceInfo();
        individualEntrepreneur.actualBalance();
        individualEntrepreneur.putMoney(1000);
        individualEntrepreneur.takeMoney(20);

        Client physicalPerson = new PhysicalPerson();
        physicalPerson.balanceInfo();
        physicalPerson.actualBalance();
        physicalPerson.putMoney(90);
        physicalPerson.takeMoney(100);

        Client legalPerson = new LegalPerson();
        legalPerson.balanceInfo();
        legalPerson.actualBalance();
        legalPerson.putMoney(50);
        legalPerson.takeMoney(5);
    }
}
