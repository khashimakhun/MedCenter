package com.example.medcenter.repository;

import com.example.medcenter.entity.DoctorsTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorsTypeRepository extends JpaRepository<DoctorsTypeEntity,Integer> {
}
