import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})

export class PetComponent implements OnInit {

  petName = "Thanh Dat";
  petImage = "assets/pet.jpg"

  constructor() { }

  ngOnInit(): void {
  }

}
