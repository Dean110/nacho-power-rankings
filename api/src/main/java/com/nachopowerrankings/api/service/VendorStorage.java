package com.nachopowerrankings.api.service;

import com.nachopowerrankings.api.domain.Vendor;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface VendorStorage {
    public Collection<Vendor> findAllVendors();
}
