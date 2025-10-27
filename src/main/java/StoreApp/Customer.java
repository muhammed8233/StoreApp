package StoreApp;

import java.time.LocalDateTime;

public class Customer {
    private String name;
    private String telNumber;
    private String address;
    private String cashier;
    private double amount;
    private  LocalDateTime dateTime;
    private double billTotal;
    private double balance;



Item item = new Item();
    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", cashier='" + cashier + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public String getCashier() {
        return cashier;
    }

    public void setAmount(double amount) {
        if (amount > 0.0 && amount > billTotal) {
            this.amount = amount;
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setDateTime(LocalDateTime dateTime){
        dateTime = LocalDateTime.now();
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime(){
        return dateTime;
    }

    public void calculateBalance(double balance) {
        if(balance > 0.0) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getBillTotal() {
        return billTotal;
    }
}
