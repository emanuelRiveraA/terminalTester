package com.Integradora.terminalTester.restcontrollers;

import com.Integradora.terminalTester.models.Registro;
import com.Integradora.terminalTester.services.RegistroService;
import com.Integradora.terminalTester.utility.Messages;
import com.Integradora.terminalTester.utility.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(UrlConstants.REGISTRO_URL)
public class RegistroRestController {

    @Autowired
    RegistroService registroService;

    @GetMapping(UrlConstants.LIST_ALL)
    public List<Registro> findAll() throws Exception {
        try {
            return registroService.getAll();
        } catch (Exception e) {
            throw new Exception(Messages.NO_CUSTPN);
        }

    }
    @PostMapping(UrlConstants.SAVE)
    public void save(@RequestBody Registro registro) throws Exception {

        try {
            // System.out.println("holamundo");
            registroService.save(registro);
        } catch (Exception e) {
            throw new Exception(Messages.CUSTOMER_SAVED_ERROR);
        }
    }

    @GetMapping(UrlConstants.GET_BY_CODER7)
    public Collection<Object> findRegistro(@PathVariable String code7) throws Exception {

        try {
            return  registroService.obtenerComponente7(code7);
        } catch (Exception e) {
            throw new Exception(Messages.NO_CUSTPN);
        }

    }

    @PutMapping(UrlConstants.UPDATE)
    public void update(@RequestBody Registro registro, @PathVariable int id) throws Exception {
        try {
            registroService.update(registro, id);
        } catch (Exception e) {
            throw new Exception(Messages.CUSTOMER_UPDATED_ERROR);
        }
    }

    @DeleteMapping(UrlConstants.DELETE_BY_ID)
    public void delete(@PathVariable int id) throws Exception {

        try {
            registroService.deleteById(id);
        } catch (Exception e) {
            throw new Exception(Messages.CUSTOMER_DELETED_ERROR);
        }

    }

}
