package com.company.samaramusor.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "SAMARAMUSOR_ORGANIZATION")
@Entity(name = "samaramusor_Organization")
public class Organization extends StandardEntity {
    private static final long serialVersionUID = 4044944641993753190L;

    @NotNull
    @Column(name = "INN", nullable = false, unique = true, length = 20)
    protected String inn;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}