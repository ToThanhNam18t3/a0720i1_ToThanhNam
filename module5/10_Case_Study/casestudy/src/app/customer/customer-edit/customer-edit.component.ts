import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerService } from 'src/app/service/customers.service';
import { Customers } from '../model/customers';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})

export class CustomerEditComponent implements OnInit {

  customerEditById:string;
  formEdit:FormGroup;


  constructor(private activeRoute: ActivatedRoute , private cus:FormBuilder , private customerService:CustomerService, private router: Router) { }

  ngOnInit(): void {
    this.customerEditById = this.activeRoute.snapshot.params["id"];
    this.initForm();
    this.formEdit.patchValue(this.customerService.getCustomerById(this.customerEditById));
  }

  initForm(){
    this.formEdit = this.cus.group({
      customerId: '',
      customerName: ['', Validators.pattern('^[0-9]{9}$')],
      customerDob: '',
      customerGender: '', 
      customerCmnd: '',
      customerNumberPhone: '',
      customerEmail: ['', Validators.email],
      customerType: '',
      customerAddress: ''
    });
  }


  editCustomer(){
    this.customerService.editCustomerById(this.formEdit.value, this.customerEditById);
    // console.log(this.formEdit.value);
    // console.log(this.customerEditById);
    this.router.navigateByUrl("");
  }


  //Validator
 
  
}
