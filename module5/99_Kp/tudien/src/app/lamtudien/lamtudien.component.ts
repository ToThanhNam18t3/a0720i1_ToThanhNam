import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lamtudien',
  templateUrl: './lamtudien.component.html',
  styleUrls: ['./lamtudien.component.css']
})
export class LamtudienComponent implements OnInit {

  newVn = "";
  newEng = "";
  isShowForm = false;
  filterStatus = "xem_tat_ca";

  arrWords = [
    { id: 1, en: 'action', vn: 'hành động', memorized: true },
    { id: 2, en: 'actor', vn: 'diễn viên', memorized: false },
    { id: 3, en: 'activity', vn: 'hoạt động', memorized: true },
    { id: 4, en: 'active', vn: 'chủ động', memorized: true },
    { id: 5, en: 'bath', vn: 'tắm', memorized: false },
    { id: 6, en: 'bedroom', vn: 'phòng ngủ', memorized: true }
  ];

  constructor() { }

    ngOnInit(): void {
    }

  addWord(){
    this.arrWords.unshift({
      id:this.arrWords.length + 1, 
      en: this.newEng,
      vn: this.newVn,
      memorized: false}
    )
    this.newVn ='';
    this.newEng = '';
    this.isShowForm = false;
  };

  deleteWord(wordId:number):void{
    const index = this.arrWords.findIndex(word => word.id === wordId);
    this.arrWords.splice(index, 1);
  }

}
