import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerService } from 'src/app/service/customers.service';
import { Customers } from '../model/customers';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {



  listCustomer : Customers[] =  [];


  // DI => DEPENDENCY INJECTION
  constructor (private customerService: CustomerService , private router: Router) {

  }


  ngOnInit(): void {
    this.initDataListCustomer();
  }

  initDataListCustomer(){
    this.listCustomer = this.customerService.getAllCustomer();
  }

  deleteCustomer(cusId){
    this.customerService.removeCustomer(cusId);
  }

}
