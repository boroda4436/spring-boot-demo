package com.example.repository;

import com.example.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Bohdan on 30.03.2017
 */
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
