package com.Integradora.terminalTester.services;

import com.Integradora.terminalTester.models.Acconfig;
import com.Integradora.terminalTester.repositories.AcconfRepository;
import com.Integradora.terminalTester.repositories.ICRUD;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AcconfService implements ICRUD<Acconfig> {

    AcconfRepository acconfRepository;

    public AcconfService(AcconfRepository acconfRepository) {
        this.acconfRepository = acconfRepository;
    }

    @Override
    public List<Acconfig> getAll() throws Exception {
        return acconfRepository.findAll();
    }

    @Override
    public Acconfig getById(int id) throws Exception {
        return null;
    }

    @Override
    public void save(Acconfig obj) throws Exception {
        acconfRepository.save(obj);
    }

    @Override
    public void update(Acconfig obj, int id) throws Exception {

    }

    @Override
    public void deleteById(int id) throws Exception {

    }
}
