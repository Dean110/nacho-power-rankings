package com.nachopowerrankings.api.service;

import com.nachopowerrankings.api.domain.Vendor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class VendorStorageImpl implements VendorStorage {
    @Override
    public Collection<Vendor> findAllVendors() {
        return List.of(new Vendor("Bob's Burgers", "Bexley, Ohio"));
    }
}
