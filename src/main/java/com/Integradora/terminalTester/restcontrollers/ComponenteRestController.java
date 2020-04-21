package com.Integradora.terminalTester.restcontrollers;

import com.Integradora.terminalTester.models.Componentes;
import com.Integradora.terminalTester.services.ComponenteService;
import com.Integradora.terminalTester.utility.Messages;
import com.Integradora.terminalTester.utility.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping(UrlConstants.COMP_URL)
public class ComponenteRestController  {

    @Autowired
    ComponenteService componenteService;

    @GetMapping(UrlConstants.LIST_ALL)
    public List<Componentes> findAll() throws Exception {
        try {
            return componenteService.getAll();
        } catch (Exception e) {
            throw new Exception(Messages.NO_CUSTPN);
        }

    }

    @GetMapping(UrlConstants.GET_BY_CODE)
    public List<Object> findComponente(@PathVariable String code, @PathVariable String referencia) throws Exception {
        try {

            return componenteService.obtenerComponente(code,referencia);
        }catch (Exception e){
            throw new Exception(Messages.CUSTPN_NOT_FOUND);
        }

    }

    @GetMapping(UrlConstants.GET_BY_CODE7)
    public Collection<Object> findComponente7(@PathVariable String code7) throws Exception {

        try {
            return  componenteService.obtenerComponente7(code7);
        } catch (Exception e) {
            throw new Exception(Messages.NO_CUSTPN);
        }

    }

    @PostMapping(UrlConstants.SAVE)
    public void save(@RequestBody Componentes componentes) throws Exception {

        try {
            // System.out.println("holamundo");
            componenteService.save(componentes);
        } catch (Exception e) {
            throw new Exception(Messages.CUSTOMER_SAVED_ERROR);
        }
    }
    @PutMapping(UrlConstants.UPDATE)
    public void update(@RequestBody Componentes componentes, @PathVariable int id) throws Exception {
        try {
            componenteService.update(componentes, id);
        } catch (Exception e) {
            throw new Exception(Messages.CUSTOMER_UPDATED_ERROR);
        }
    }

    @DeleteMapping(UrlConstants.DELETE_BY_ID)
    public void delete(@PathVariable int id) throws Exception {

        try {
            componenteService.deleteById(id);
        } catch (Exception e) {
            throw new Exception(Messages.CUSTOMER_DELETED_ERROR);
        }

    }

}
