import { Component, OnInit } from '@angular/core';
import { ContactsComponent } from './contacts/contacts.component';
import { ContactDetailComponent } from './contact-detail/contact-detail.component';
// import { ContactsComponent } from '';

@Component({
  selector: 'app-app-routing',
  templateUrl: './app-routing.component.html',
  styleUrls: ['./app-routing.component.css']
})
export class AppRoutingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
