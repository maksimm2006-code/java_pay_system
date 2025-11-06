package PaySystem.service;

import PaySystem.entity.Account;
import PaySystem.entity.Bill;

public class PaymentService {

    public void pay(Account account, int amount){
        Bill bill = account.getBill();
        if(bill.getAmount() < amount){
            System.out.println("Платеж невозможен, недостаточно средств");
        }else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Происходит операци платежа, текущее значение счета: " + currentBillAmount);
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Платеж выполнен, новое значение счета: " + bill.getAmount());
        }

    }
}
