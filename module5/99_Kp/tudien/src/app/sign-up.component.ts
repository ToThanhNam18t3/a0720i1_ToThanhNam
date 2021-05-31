import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup , FormBuilder , Validator, Validators } from '@angular/forms';

@Component({
    selector: 'app-sign-up', 
    template: `
        <form (ngSubmit) = "onSubmit()" [formGroup]="formSignUp">
            <input type="text" placeholder="email" formControlName="email"> <br><br>
            <p *ngIf = "formSignUp.get('email').invalid && formSignUp.get('email').touched">Địt mm điền vô nha !</p>
            <input type="text" placeholder="password" formControlName="password"> <br> <br>
            <button type="submit" [disabled] = "formSignUp.invalid">Submit</button>
        </form>
    `
})

export class SignUpComponent implements OnInit{

    formSignUp: FormGroup;

    constructor(private fb: FormBuilder){
    }


    ngOnInit(): void {
        this.formSignUp = this.fb.group({
            email: ['', Validators.required], 
            password: ''
        })
    }

    onSubmit(){
        console.log(this.formSignUp.value);
    }
}

