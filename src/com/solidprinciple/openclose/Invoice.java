package com.solidprinciple.openclose;

import java.time.LocalDateTime;

public class Invoice {
    private String name;
    private int amount;
    private LocalDateTime localDateTime;

    public Invoice() {
    }

    public Invoice(String name, int amount, LocalDateTime localDateTime) {
        this.name = name;
        this.amount = amount;
        this.localDateTime = localDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
