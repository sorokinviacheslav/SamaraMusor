package com.company.samaramusor.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "SAMARAMUSOR_STREET")
@Entity(name = "samaramusor_Street")
public class Street extends StandardEntity {
    private static final long serialVersionUID = -9146713451231635456L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "MIN_NUMBER", nullable = false)
    protected Integer minNumber;

    @NotNull
    @Column(name = "MAX_NUMBER", nullable = false)
    protected Integer maxNumber;

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public Integer getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(Integer minNumber) {
        this.minNumber = minNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}