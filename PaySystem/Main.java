package PaySystem;

import PaySystem.entity.Account;
import PaySystem.entity.Bill;
import PaySystem.entity.Payment;
import PaySystem.entity.Person;
import PaySystem.service.DepositService;
import PaySystem.service.PaymentService;
import PaySystem.service.TransferService;

public class Main {
    public static void main(String[] args) {
        Person loriPerson = new Person("Lori", "Cat", "Dog", "+795833958");
        Bill loriBill = new Bill(10000);
        Account loriAccount = new Account(loriPerson, loriBill);

        Person baxterPerson = new Person("Baxter", "Smith", "Serggevich", "+73456781");
        Bill baxterBill = new Bill(8000);
        Account baxterAccount = new Account(baxterPerson, baxterBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(loriAccount, 1000);
        System.out.println();
        paymentService.pay(baxterAccount,1500);

        System.out.println();

        DepositService depositService = new DepositService();
        depositService.deposit(loriAccount, 5000);
        System.out.println();
        depositService.deposit(baxterAccount, 12000);

        TransferService transferService = new TransferService();
        transferService.transfer(baxterAccount, loriAccount,5000);
    }
}
