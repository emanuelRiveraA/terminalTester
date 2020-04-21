package com.Integradora.terminalTester.services;

import com.Integradora.terminalTester.models.Registro;
import com.Integradora.terminalTester.repositories.ICRUD;
import com.Integradora.terminalTester.repositories.RegistroRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
@Service
public class RegistroService implements ICRUD<Registro> {

    public RegistroService(RegistroRepository registroRepository) {
        this.registroRepository = registroRepository;
    }

    RegistroRepository registroRepository;
    @Override
    public List<Registro> getAll() throws Exception {
        return registroRepository.findAll();
    }

    @Override
    public Registro getById(int id) throws Exception {
        return null;
    }

    public Collection<Object> obtenerComponente7(String code7){
        return  registroRepository.obtenerComponente7(code7);
    }

    @Override
    public void save(Registro obj) throws Exception {
                registroRepository.save(obj);
    }

    @Override
    public void update(Registro obj, int id) throws Exception {
        registroRepository.save(obj);
    }

    @Override
    public void deleteById(int id) throws Exception {
        registroRepository.deleteById(id);
    }
}
