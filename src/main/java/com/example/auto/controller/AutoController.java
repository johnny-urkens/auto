package com.example.auto.controller;

import com.example.auto.model.Auto;
import com.example.auto.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class AutoController {

    @Autowired
    private AutoRepository autoRepository;

    @PostConstruct
    public void fillDB(){
        if(autoRepository.count()==0){
            autoRepository.save(new Auto("1abc111", "opel","rood"));
            autoRepository.save(new Auto("2abc222", "VW","blauw"));
            autoRepository.save(new Auto("3abc333", "bmw","zwart"));
        }
        System.out.println(autoRepository.findAutoByNrplaat("1abc111").getMerk());
        System.out.println(autoRepository.findAutoByNrplaat("2abc222").getMerk());
    }
    @GetMapping("/autos/merk/{merk}")
    public List<Auto> findAutosByMerk(@PathVariable String merk){
        return autoRepository.findAutosByMerkContaining(merk);
    }

    @GetMapping("/autos/{nrplaat}")
        public Auto getAutoByNrplaat(@PathVariable String nrplaat){
        return autoRepository.findAutoByNrplaat(nrplaat);
    }

}
