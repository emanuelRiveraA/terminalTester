package com.Integradora.terminalTester.restcontrollers;

import com.Integradora.terminalTester.models.NumParte;
import com.Integradora.terminalTester.services.PartNumberService;
import com.Integradora.terminalTester.utility.Messages;
import com.Integradora.terminalTester.utility.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UrlConstants.NUMBER_URL)
public class PartNumRestcontroller {

    @Autowired
    PartNumberService partNumberService;

    @GetMapping(UrlConstants.LIST_ALL)
    public List<NumParte> findAll() throws Exception {
        try {
            return partNumberService.getAll();
        } catch (Exception e) {
            throw new Exception(Messages.NO_CUSTPN);
        }

    }
    @PostMapping(UrlConstants.SAVE)
    public void save(@RequestBody NumParte numParte) throws Exception {

        try {
            // System.out.println("holamundo");
            partNumberService.save(numParte);
        } catch (Exception e) {
            throw new Exception(Messages.CUSTOMER_SAVED_ERROR);
        }
    }
    @PutMapping(UrlConstants.UPDATE)
    public void update(@RequestBody NumParte numParte, @PathVariable int id) throws Exception {
        try {
            partNumberService.update(numParte, id);
        } catch (Exception e) {
            throw new Exception(Messages.CUSTOMER_UPDATED_ERROR);
        }
    }

    @DeleteMapping(UrlConstants.DELETE_BY_ID)
    public void delete(@PathVariable int id) throws Exception {

        try {
            partNumberService.deleteById(id);
        } catch (Exception e) {
            throw new Exception(Messages.CUSTOMER_DELETED_ERROR);
        }

    }


}
