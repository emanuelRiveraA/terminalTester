package com.Integradora.terminalTester.repositories;

import com.Integradora.terminalTester.models.NumParte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartNumberRepository extends JpaRepository<NumParte,Integer> {

}
