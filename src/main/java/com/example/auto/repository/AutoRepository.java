package com.example.auto.repository;

import com.example.auto.model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Integer> {
    Auto findAutoByNrplaat(String nrplaat);
    List<Auto> findAutosByMerkContaining(String merk);
}
