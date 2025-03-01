package com.c1se_01.roomiego.repository;

import com.c1se_01.roomiego.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Integer> {
}
