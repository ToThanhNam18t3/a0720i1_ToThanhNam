import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-person',
  templateUrl: './list-person.component.html',
  styleUrls: ['./list-person.component.css']
})
export class ListPersonComponent implements OnInit {

  arrPeople = [
    {name: "Nam" , age: 10}, 
    {name: "Tu" , age: 11}, 
    {name: "Hoa" , age: 10}, 
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
