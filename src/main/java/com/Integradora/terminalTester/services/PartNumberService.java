package com.Integradora.terminalTester.services;

import com.Integradora.terminalTester.models.NumParte;
import com.Integradora.terminalTester.repositories.ICRUD;
import com.Integradora.terminalTester.repositories.PartNumberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PartNumberService implements ICRUD <NumParte> {

PartNumberRepository partNumberRepository;

    public PartNumberService(PartNumberRepository partNumberRepository) {
        this.partNumberRepository = partNumberRepository;
    }

    @Override
    public List<NumParte> getAll() throws Exception {
        return partNumberRepository.findAll();
    }

    @Override
    public NumParte getById(int id) throws Exception {
        return null;
    }

    @Override
    public void save(NumParte obj) throws Exception {
            partNumberRepository.save(obj);
    }

    @Override
    public void update(NumParte obj, int id) throws Exception {
          partNumberRepository.save(obj);
    }

    @Override
    public void deleteById(int id) throws Exception {
          partNumberRepository.deleteById(id);
    }
}
