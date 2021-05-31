import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Routes , RouterModule } from '@angular/router'

const routesConfig : Routes = [
  {path: 'contact' , component: ContactsComponent},
  {path: 'detail' , component: ContactDetailComponent},
  {path: '' , redirectTo: '/contact', pathMatch: 'full'},
  {path: '**' , redirectTo: '/page-error'}
]

import { AppComponent } from './app.component';
import { LamtudienComponent } from './lamtudien/lamtudien.component';
import { FormsModule , ReactiveFormsModule } from '@angular/forms';
import { PersonComponent } from './person/person.component';
import { ListPersonComponent } from './list-person/list-person.component';
import { ChildComponent } from './child.component';
import { ParentComponent } from './parent.component';
import { SignUpComponent } from './sign-up.component';
import { ContactsComponent } from './contacts/contacts.component';
import { ContactDetailComponent } from './contact-detail/contact-detail.component';
import { AppRoutingComponent } from './app-routing/app-routing.component';  





@NgModule({
  declarations: [
    AppComponent,
    LamtudienComponent,
    PersonComponent,
    ListPersonComponent,
    ParentComponent, 
    ChildComponent, 
    SignUpComponent, ContactsComponent, ContactDetailComponent, AppRoutingComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routesConfig)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
