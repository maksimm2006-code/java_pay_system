package PaySystem.entity;

import lombok.*;

@Getter
@Setter
public class Payment {
    private Bill bill;

    public Payment(Bill bill){
        this.bill = bill;
    }

}
