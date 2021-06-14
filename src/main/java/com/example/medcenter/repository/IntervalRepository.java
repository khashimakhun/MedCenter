package com.example.medcenter.repository;

import com.example.medcenter.entity.IntervalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IntervalRepository extends JpaRepository<IntervalEntity,Integer> {
    IntervalEntity findIntervalEntityById(int id);
    List<IntervalEntity> findAllById(int id);
//    List<IntervalEntity> findA();

}
