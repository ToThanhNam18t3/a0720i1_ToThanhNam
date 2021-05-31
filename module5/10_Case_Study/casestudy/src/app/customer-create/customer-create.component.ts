import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {

  formCreate:FormGroup;

  constructor() { 
    this.formCreate = new FormGroup({
      id: new FormControl(), 
      dob: new FormControl(), 
      name: new FormControl(),
      cmnd: new FormControl(), 
      email: new FormControl(), 
      phone: new FormControl(), 
      address: new FormControl(), 
      type: new FormControl(), 
    })
  }

  onSubmit(){
    console.log(this.formCreate.value);
  }

  ngOnInit(): void {
  }

  

}
