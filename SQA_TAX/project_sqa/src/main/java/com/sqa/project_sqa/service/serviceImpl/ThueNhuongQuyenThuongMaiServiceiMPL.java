package com.sqa.project_sqa.service.serviceImpl;

import com.sqa.project_sqa.entities.ThueNhuongQuyenThuongMai;
import com.sqa.project_sqa.repositories.ThueNhuongQuyenThuongMaiRepo;
import com.sqa.project_sqa.service.ThueNhuongQuyenThuongMaiService;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThueNhuongQuyenThuongMaiServiceiMPL implements ThueNhuongQuyenThuongMaiService {
    @Autowired
    private ThueNhuongQuyenThuongMaiRepo thueNhuongQuyenThuongMaiRepo;
    @Override
    public ThueNhuongQuyenThuongMai saveThueNhuongQuyenThuongMaiService(ThueNhuongQuyenThuongMai thueNhuongQuyenThuongMai) {
        return thueNhuongQuyenThuongMaiRepo.save(thueNhuongQuyenThuongMai);
    }

    @Override
    public String Tax_ecommerce(BigDecimal assessable_income){
        BigDecimal tax;
        BigDecimal ratio = new BigDecimal("0.05");
        if (assessable_income.compareTo(new BigDecimal("10000000")) > 0) {
            tax = assessable_income.multiply(ratio);
        } else {
            tax = BigDecimal.ZERO;
        }
        return tax.setScale(0, RoundingMode.HALF_UP).toString();
    }
}
