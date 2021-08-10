import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-emp21',
  // templateUrl: './emp21.component.html',
  template : `{{name}} 
  <p [ngClass]= "{classone: cone,
                  classtwo: ctwo}">Change Color</p>
                  <button (click)='changeData()'>Click to set diff CSS Class</button>
  ` ,
  styles:[`.classone{color:red}
           .classtwo{background-color:green; color: yellow;}
  `] 
})
export class Emp21Component implements OnInit {

  name : 'ClassDirective'
  cone: boolean = true;
  ctwo : boolean = false;

  constructor() { }

  ngOnInit() {
  }

  changeData(){
    this.cone= !this.cone;
    this.ctwo= !this.ctwo
  }

}
