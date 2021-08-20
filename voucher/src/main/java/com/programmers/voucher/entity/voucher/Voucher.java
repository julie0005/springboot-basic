package com.programmers.voucher.entity.voucher;

import java.io.Serializable;

public abstract class Voucher implements Serializable {

    protected long id;
    protected String name;

    public Voucher(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Voucher(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int discount(int original);

    @Override
    public String toString() {
        return String.format("[Voucher #%d] %s", id, name);
    }

    public enum type {
        FIXED, PERCENT, NA
    }
}
