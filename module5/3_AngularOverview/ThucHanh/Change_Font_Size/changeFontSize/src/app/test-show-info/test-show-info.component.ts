import { Component, OnInit } from '@angular/core';
import {Student} from "./Student";

@Component({
  selector: 'app-test-show-info',
  templateUrl: './test-show-info.component.html',
  styleUrls: ['./test-show-info.component.css']
})
export class TestShowInfoComponent implements OnInit {
  students : Student[] = [
    {studentNo: 1, name: "Thanh Nam" , address: "87 Cao Thang" , city: "Da Nang" , country: "Viet Nam", state: "Mien Trung"},
    {studentNo: 2, name: "Thanh Nam 1" , address: "87 Cao Thang" , city: "Da Nang" , country: "Viet Nam", state: "Mien Trung"},
    {studentNo: 3, name: "Thanh Nam 2" , address: "87 Cao Thang" , city: "Da Nang" , country: "Viet Nam", state: "Mien Trung"},
    {studentNo: 4, name: "Thanh Nam 3" , address: "87 Cao Thang" , city: "Da Nang" , country: "Viet Nam", state: "Mien Trung"}
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
