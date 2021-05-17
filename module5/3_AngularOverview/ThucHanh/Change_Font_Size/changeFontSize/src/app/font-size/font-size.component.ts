import { Component, OnInit } from '@angular/core';

export interface IStudent {
  id: number;
  name: String;
  mark: number;
  image: String;
}

@Component({
  selector: 'app-font-size',
  templateUrl: './font-size.component.html',
  styleUrls: ['./font-size.component.css']
})
export class FontSizeComponent implements OnInit {
    student: IStudent = {
      id: 1,
      name: 'Nguyen Van A',
      mark: 10,
      image: 'https://www.dungplus.com/wp-content/uploads/2019/12/girl-xinh-1-480x600.jpg'
  };


  constructor() { }

  ngOnInit(): void {
  }

  fontSize = 14;
  onChange(value) {
    this.fontSize = value;
  }
  // getMark(value : any){
  //   this.student.mark = value;
  // }

}
