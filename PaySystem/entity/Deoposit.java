package PaySystem.entity;

public class Deoposit {
    private Bill bill;

    public Deoposit(Bill bill){
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}