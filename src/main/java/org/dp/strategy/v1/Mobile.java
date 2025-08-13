package org.dp.strategy.v1;

public class Mobile {
    private final String name;
    private final double price;
    private final double performanceScore;

    public Mobile(String name, double  price, double  performanceScore) {
        this.name = name;
        this.price = price;
        this.performanceScore = performanceScore;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getPerformanceScore() {
        return performanceScore;
    }
}
