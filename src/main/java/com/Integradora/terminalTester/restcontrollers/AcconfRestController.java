package com.Integradora.terminalTester.restcontrollers;


import com.Integradora.terminalTester.models.Acconfig;
import com.Integradora.terminalTester.services.AcconfService;
import com.Integradora.terminalTester.utility.Messages;
import com.Integradora.terminalTester.utility.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UrlConstants.CONFIG_URL)
public class AcconfRestController  {

    @Autowired
    AcconfService acconfService;

    @GetMapping(UrlConstants.LIST_ALL)
    public List<Acconfig> findAll() throws Exception {
        try {
            return acconfService.getAll();
        } catch (Exception e) {
            throw new Exception(Messages.NO_CUSTPN);
        }

    }
    @PostMapping(UrlConstants.SAVE)
    public void save(@RequestBody Acconfig acconfig) throws Exception {

        try {
           // System.out.println("holamundo");
            acconfService.save(acconfig);
        } catch (Exception e) {
            throw new Exception(Messages.CUSTOMER_SAVED_ERROR);
        }
    }
    @PutMapping(UrlConstants.UPDATE)
    public void update(@RequestBody Acconfig acconfig, @PathVariable int id) throws Exception {
        try {
            acconfService.update(acconfig, id);
        } catch (Exception e) {
            throw new Exception(Messages.CUSTOMER_UPDATED_ERROR);
        }
    }

    @DeleteMapping(UrlConstants.DELETE_BY_ID)
    public void delete(@PathVariable int id) throws Exception {

        try {
            acconfService.deleteById(id);
        } catch (Exception e) {
            throw new Exception(Messages.CUSTOMER_DELETED_ERROR);
        }

    }
}
