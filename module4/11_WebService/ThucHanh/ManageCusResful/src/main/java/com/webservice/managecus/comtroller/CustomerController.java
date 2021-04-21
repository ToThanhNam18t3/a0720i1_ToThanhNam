package com.webservice.managecus.comtroller;

import antlr.collections.List;
import com.webservice.managecus.model.Customer;
import com.webservice.managecus.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public ResponseEntity<List<Customer>> showAll(){
        List<Customer> customerList = customerService.showAll();
        if(customerList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customerList,HttpStatus.OK);
    }

    @GetMapping( value = "/customer/{id}")
    public ResponseEntity<Customer> findCusById(@PathVariable int id){
        Customer customer = customerService.findById(id);
        if(customer == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(customer, HttpStatus.OK);
        }
    }

//    @PostMapping( value = "/customers")
//    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer, )





}
