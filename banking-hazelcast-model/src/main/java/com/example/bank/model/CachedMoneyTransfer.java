package com.example.bank.model;

import java.io.Serializable;

public class CachedMoneyTransfer implements Serializable { // For Hazelcast serialization

    private String transferId;
    private String account;
    private String partnerAccount;
    private int amount;
    private Direction direction;

    public CachedMoneyTransfer(String transferId, String account, String partnerAccount, int amount, Direction direction) {
        this.transferId = transferId;
        this.account = account;
        this.partnerAccount = partnerAccount;
        this.amount = amount;
        this.direction = direction;
    }

    public String getTransferId() {
        return transferId;
    }

    public String getAccount() {
        return account;
    }

    public String getPartnerAccount() {
        return partnerAccount;
    }

    public int getAmount() {
        return amount;
    }

    public Direction getDirection() {
        return direction;
    }

    public enum Direction {
        IN, OUT
    }
}