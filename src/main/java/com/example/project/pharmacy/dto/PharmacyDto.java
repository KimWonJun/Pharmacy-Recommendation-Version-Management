package com.example.project.pharmacy.dto;

import com.example.project.pharmacy.entity.Pharmacy;
import com.example.project.pharmacy.service.PharmacyRepositoryService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class PharmacyDto {
    private Long id;
    private String pharmacyName;
    private String pharmacyAddress;
    private double latitude;
    private double longitude;
}
