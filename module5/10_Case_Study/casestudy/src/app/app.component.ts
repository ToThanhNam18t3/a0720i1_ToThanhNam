import { Component } from '@angular/core';
import { Customers } from './model/customers';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'casestudy';

  customers : Customers[] = [
    {customerId: "1" , customerName: "Anh Trung" , customerDob: "2000/07/07" , customerGender: "Nu" , customerCmnd: 1234 , customerNumberPhone: 97573121, 
     customerEmail: "trungdoan@gmail.com" , customerType: "Vip" , customerAddress: "87 Cao Thang"}, 
    {customerId: "2" , customerName: "Anh Viet" , customerDob: "2000/07/07" , customerGender: "Nu" , customerCmnd: 5678 , customerNumberPhone: 97573121, 
    customerEmail: "hoangviet@gmail.com" , customerType: "Vip" , customerAddress: "87 Cao Thang"}, 
    {customerId: "3" , customerName: "Anh Done" , customerDob: "2000/07/07" , customerGender: "Nu" , customerCmnd: 91011 , customerNumberPhone: 97573121, 
     customerEmail: "quocdone@gmail.com" , customerType: "Vip" , customerAddress: "87 Cao Thang"} 
  ]

  
}
