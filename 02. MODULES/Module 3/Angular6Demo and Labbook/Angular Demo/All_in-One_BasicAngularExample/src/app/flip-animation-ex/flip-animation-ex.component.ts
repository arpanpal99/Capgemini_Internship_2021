import { Component, OnInit } from '@angular/core';
import { FlipAnimation } from './flipAnimation'
@Component({
  selector: 'app-flip-animation-ex',
  templateUrl: './flip-animation-ex.component.html',
  styleUrls: ['./flip-animation-ex.component.css'],
  animations: FlipAnimation.animations
})
export class FlipAnimationExComponent implements OnInit {

  flip = 'inactive';

  constructor() { }

  ngOnInit() {
  }
  
  toggleFlip() {
    this.flip = this.flip === 'inactive' ? 'active' : 'inactive';
  }

}
