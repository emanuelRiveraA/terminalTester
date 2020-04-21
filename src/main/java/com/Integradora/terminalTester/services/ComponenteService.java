package com.Integradora.terminalTester.services;

import com.Integradora.terminalTester.models.Componentes;
import com.Integradora.terminalTester.repositories.ComponentesRepository;
import com.Integradora.terminalTester.repositories.ICRUD;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ComponenteService implements ICRUD <Componentes>{

    ComponentesRepository componentesRepository;

    public ComponenteService(ComponentesRepository componentesRepository) {
        this.componentesRepository = componentesRepository;
    }

    @Override
    public List<Componentes> getAll() throws Exception {
        return componentesRepository.findAll();
    }

    public List<Object> obtenerComponente(String code, String referencia){
        return  componentesRepository.obtenerComponente(code, referencia);
    }

    @Override
    public Componentes getById(int id) throws Exception {
        return null;
    }

    public Collection<Object> obtenerComponente7(String code7){
        return  componentesRepository.obtenerComponente7(code7);
    }

    @Override
    public void save(Componentes obj) throws Exception {

    }

    @Override
    public void update(Componentes obj, int id) throws Exception {

    }

    @Override
    public void deleteById(int id) throws Exception {

    }
}

