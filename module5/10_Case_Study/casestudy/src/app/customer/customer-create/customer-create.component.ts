import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup , FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CustomerService } from 'src/app/service/customers.service';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {

  formCreate: FormGroup;

  constructor(private customerService: CustomerService, private router: Router, private cus:FormBuilder) {

  }

  validationMessage = {
    'customerId': [
      {type: 'required', message: 'Mã khách hàng không để trống'},
      {type: 'pattern', message: 'Mã khách hàng không đúng định dạng KH-XXXX'},
      {type: 'exist', message: 'Mã khách hàng đã tồn tại'}
    ],
    'customerName': [
      {type: 'required', message: 'Tên khách hàng không để trống'}
    ],
    'customerDob': [
      {type: 'required', message: 'Ngày sinh không để trống'},
      {type: 'pattern', message: 'Ngày sinh không đúng định dạng dd/MM/yyyy'},
      {type: 'invalid', message: 'Ngày không hợp lệ'}
    ],
    'customerGender': [
      {type: 'required', message: 'Ngày sinh không để trống'},
    ],
    'customerCmnd': [
      {type: 'required', message: 'CMND không để trống'},
      {type: 'pattern', message: 'CMND gồm 9 hoặc 12 chữ số'}
    ],
    'customerNumberPhone': [
      {type: 'required', message: 'Số điện thoại không để trống'},
      {type: 'pattern', message: 'Số điện thoại không đúng định dạng'}
    ],
    'customerEmail': [
      {type: 'required', message: 'Email không để trống'},
      {type: 'email', message: 'Email không đúng định dạng'}
    ],
    'customerType': [
      {type: 'required', message: 'Chưa chọn hạng khách hàng'},
    ],
    'customerAddress': [
      {type: 'required', message: 'Email không để trống'},
    ]
  };




  ngOnInit(): void {
    this.initForm();
  }

  initForm() {
    this.formCreate = this.cus.group({
      customerId: ['',],
      customerName: '',
      customerDob: '',
      customerGender: '', 
      customerCmnd: ['' , Validators.pattern('^[0-9]{9}$')],
      customerNumberPhone: '',
      customerEmail: ['', Validators.email],
      customerType: '',
      customerAddress: '',
    });
  }


    createCustomer() {
      // if (this.formCreate.valid) {
      //   this.customerService.save(this.formCreate.value);
      //   this.router.navigateByUrl("");
      // //   console.log(this.formCreate.value);
      // }
      this.customerService.save(this.formCreate.value);
      this.router.navigateByUrl("");
    }


 
}

