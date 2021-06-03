export class Customers {
    customerId: String;
    customerName: String;
    customerDob: String;
    customerGender: String;
    customerCmnd: Number;
    customerNumberPhone: Number;
    customerEmail: String;
    customerType: String;
    customerAddress: String;

    constructor(customerId: String , 
        customerName: String , 
        customerDob: String , 
        customerGender: String , 
        customerCmnd: Number , 
        customerNumberPhone: Number , 
        customerEmail: String , 
        customerType: String ,
         customerAddress: String)
          {
            this.customerId = customerId;
            this.customerName = customerName;
            this.customerDob = customerDob;
            this.customerGender = customerGender;
            this.customerCmnd = customerCmnd;
            this.customerNumberPhone = customerNumberPhone;
            this.customerEmail = customerEmail;
            this.customerType = customerType;
            this.customerAddress = customerAddress;
          }   
 }



 