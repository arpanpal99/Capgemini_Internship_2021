import { Component, OnInit } from '@angular/core';
import { trigger, state, transition, style, animate } from '@angular/animations';

@Component({
  selector: 'app-animation-ex',
  templateUrl: './animation-ex.component.html',
  styleUrls: ['./animation-ex.component.css'],
  animations : 
  [
   trigger('changeDivSize' , 
   [
    state('initial', style({
      backgroundColor: 'green',
      // width: '100px',
      // height: '100px'
    transform : 'scale(1)'
    })),
    state('final', style({
      backgroundColor: 'red',
      // width: '200px',
      // height: '200px'
      transform : 'scale(1.5)'
    })),
    transition('intial=>final', animate('1500ms')),
    transition('final=>initial', animate('1000ms'))
   ])

  ]
})
export class AnimationExComponent implements OnInit {

  currentState = 'initial';

  constructor() { }

  ngOnInit() {
  }

  changeState(){
    this.currentState = this.currentState === 'initial' ? 'final' : 'initial';
  }

}
