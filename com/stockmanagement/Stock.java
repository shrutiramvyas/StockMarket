package com.stockmanagement;

public class Stock {
    private String stockName;
    private int noOfShares;
    private double priceOfStock;
    private double totalValue;

    //default constructor
    public Stock(){

    }
    //parameterized constructor
    public Stock(String companyName,int numberOfShares,double price){
        this.stockName=companyName;
        this.noOfShares=numberOfShares;
        this.priceOfStock=price;
    }

    public String getStockName() {
        return stockName;
    }


    public void setPriceOfStock(double priceOfStock) {
        this.priceOfStock = priceOfStock;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public int getNoOfShares() {
        return noOfShares;
    }
    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }
    public double getPriceOfStock() {
        return priceOfStock;
    }
    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
    @Override
    public String toString(){
        return "Company "+stockName+"\n Number Of Shares"+noOfShares+"\nPriceOfStock"+priceOfStock+"\nTotalValue :"+getTotalValue();
    }

}
