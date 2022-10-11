package com.stockmanagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class StockPortFolio {
    Scanner scanner=new Scanner(System.in);
    ArrayList<Stock> list = new ArrayList<>();
    public void getStockData(){
        System.out.println("Enter Stock Name: = ");
        String stockName=scanner.next();
        System.out.println("Enter Number Of Shares = ");
        int numberOfShares=scanner.nextInt();
        System.out.println("Enter stock price = ");
        double price= scanner.nextDouble();

        Stock stock=new Stock(stockName,numberOfShares,price);
        list.add(stock);
        System.out.println("Stock is added");

    }
    public void addNumberOfStocks(){
        System.out.println("Enter number of stocks =");
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            getStockData();
        }
    }
    public double totalStockValue(){
        double totalValue=0.0;
        for(Stock stock: list){
            totalValue+=stock.getNoOfShares()*stock.getPriceOfStock();
        }
        return totalValue;
    }


    // public static void main(String[] args) {
    //     StockPortFolio sp =new StockPortFolio();
    //     sp.addNumberOfStocks();
    //     sp.totalStockValue();
    // }

}
