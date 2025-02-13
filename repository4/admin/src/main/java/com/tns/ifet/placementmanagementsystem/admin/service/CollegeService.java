package com.tns.ifet.placementmanagementsystem.admin.service;

import java.util.List;

import com.tns.ifet.placementmanagementsystem.admin.entity.College;

public interface CollegeService {
    College saveCollege(College college);
    List<College> getAllColleges();
    College getCollegeById(Long id);
    College updateCollege(Long id, College collegeDetails);
    void deleteCollege(Long id);
}
