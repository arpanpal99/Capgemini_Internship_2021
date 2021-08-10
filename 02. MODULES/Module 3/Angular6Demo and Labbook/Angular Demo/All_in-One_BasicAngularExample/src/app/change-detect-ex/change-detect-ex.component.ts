import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-change-detect-ex',
  templateUrl: './change-detect-ex.component.html',
  styleUrls: ['./change-detect-ex.component.css']
})
export class ChangeDetectExComponent implements OnInit {

  private EmployeeObj :{
    name : string,
    email : string
  }

  constructor() { 
    this.EmployeeObj = {
      name : 'Mohammed Ishaque' ,
      email : 'ishq@gmail.com'
    }

  }

  ngOnInit() {
  }


  changeName(){
    this.EmployeeObj.name = 'Ishaque Basha';
  }

  changeObjRef(){
      this.EmployeeObj = {
        name : 'Ishaque Mohammed',
        email : 'NewMail@gmail.com'
      }
  }

}
