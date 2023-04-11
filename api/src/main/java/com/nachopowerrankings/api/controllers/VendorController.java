package com.nachopowerrankings.api.controllers;

import com.nachopowerrankings.api.domain.Vendor;
import com.nachopowerrankings.api.service.VendorStorage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class VendorController {
    private final VendorStorage vendorStorage;

    public VendorController(VendorStorage vendorStorage) {
        this.vendorStorage = vendorStorage;
    }

    @GetMapping("/vendors")
    public Collection<Vendor> allVendors(){
        return vendorStorage.findAllVendors();
    }
}
