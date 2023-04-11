package com.nachopowerrankings.api.domain;

import java.util.Objects;

public class Vendor {
    public long id;
    public String name;
    public String location;

    public Vendor(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vendor vendor = (Vendor) o;
        return getId() == vendor.getId() && Objects.equals(getName(), vendor.getName()) && Objects.equals(getLocation(), vendor.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getLocation());
    }
}
