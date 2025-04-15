package com.demo.demo.domain.repository;

import com.demo.demo.domain.entity.Calculator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculatorRepository extends JpaRepository<Calculator, Long> {

}
