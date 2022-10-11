package com.stockmanagement;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class StockAccount {
    public String customerName;
    private double account;  
    StockPortFolio sc = new StockPortFolio();

    StockAccount(String customerName, double account){
        this.account=account;
        this.customerName=customerName;
    }

    public void buy(){
        if(account>=1000){
            sc.addNumberOfStocks();
            double price = sc.totalStockValue();
            account = account - price;
        }
        else{
            System.out.println("You dont have enough balance");
        }
        display();
    }

    public void sell(double price){
        account = account + price;
        display();
    }
    public void display(){
        System.out.println("Your name: " + this.customerName + " Your account balance after selling shares: " + this.account);
    }

    public static void main(String[] args) {
    StockAccount sa = new StockAccount("Ram",100000.00);
    sa.buy();
    sa.sell(6000.00);
    }
}

