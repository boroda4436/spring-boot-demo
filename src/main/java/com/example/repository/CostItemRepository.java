package com.example.repository;

import com.example.entity.CostItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by b.chupika on 28.03.2017
 */
public interface CostItemRepository extends JpaRepository<CostItem, Long> {

}
