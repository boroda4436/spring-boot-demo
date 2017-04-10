package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.CostCategory;

/**
 * Created by b.chupika on 28.03.2017
 */
public interface CostCategoryRepository extends JpaRepository<CostCategory, Long> {

}
