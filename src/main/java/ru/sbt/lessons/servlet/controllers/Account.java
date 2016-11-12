package ru.sbt.lessons.servlet.controllers;

/**
 * Created by SBTJavastudent on 12.11.2016.
 */
public class Account {

    private Long id;
    private String pan;
    private long balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Account(Long id, String pan, long balance) {
        this.id = id;
        this.pan = pan;
        this.balance = balance;
    }
}
