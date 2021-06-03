import { Injectable, Input } from '@angular/core';

import { Customers } from '../customer/model/customers'


//DI
@Injectable({
    providedIn: 'root'
})

export class CustomerService {


    // declaration list in here

    customers: Customers[] = [
        {
            customerId: "1", customerName: "Anh Trung", customerDob: "2000/07/07", customerGender: "Nu", customerCmnd: 1234, customerNumberPhone: 97573121,
            customerEmail: "trungdoan@gmail.com", customerType: "Vip", customerAddress: "87 Cao Thang"
        },
        {
            customerId: "2", customerName: "Anh Viet", customerDob: "2000/07/07", customerGender: "Nu", customerCmnd: 5678, customerNumberPhone: 97573121,
            customerEmail: "hoangviet@gmail.com", customerType: "Vip", customerAddress: "87 Cao Thang"
        },
        {
            customerId: "3", customerName: "Anh Done", customerDob: "2000/07/07", customerGender: "Nu", customerCmnd: 91011, customerNumberPhone: 97573121,
            customerEmail: "quocdone@gmail.com", customerType: "Vip", customerAddress: "87 Cao Thang"
        }
    ]

    constructor() {

    }


    getAllCustomer(): Customers[] {
        return this.customers;
    }

    save(customer: Customers) {
        this.customers.push(customer);
    }


    removeCustomer(customerId: String): void {
        const cusId = this.customers.findIndex(customer => customer.customerId === customerId);
        this.customers.splice(cusId, 1);
    }

    getCustomerById(id: String): Customers {
        for (const customer of this.customers) {
            if (id === customer.customerId) {
                return customer;
            }
        }
        return null;
    }

    editCustomerById(customer: Customers, id: String) {
        for (let i = 0; i < this.customers.length; i++) {
            if (this.customers[i].customerId == id) {
                this.customers[i] = customer;
            }
        }

    }
}
