package com.company.samaramusor.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PaymentStatus implements EnumClass<Integer> {

    IN_TIME(10),
    PAYED_WITH_DELAY(20),
    UNPAID(30),
    EXPIRED(40);

    private Integer id;

    PaymentStatus(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static PaymentStatus fromId(Integer id) {
        for (PaymentStatus at : PaymentStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}