import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-apr21-parent',
  templateUrl: './apr21-parent.component.html',
  styleUrls: ['./apr21-parent.component.css']
})
export class Apr21ParentComponent implements OnInit {

  //fromParentMessageToChild: string = 'From parent Default Value';

  receiveChildMessage: string; //declared variable to rx value form parent...

  constructor() { }

  ngOnInit() {
  }

  // sendToChild(message: string) {
  //   this.fromParentMessageToChild = message;
  // }

  //to get message from child to parent
  getMessage(message: string) {
    this.receiveChildMessage = message;
  }

}
