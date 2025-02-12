package com.tns.ifet.placementmanagementsystem.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.ifet.placementmanagementsystem.admin.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
}
