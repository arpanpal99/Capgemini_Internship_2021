import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
 
  receivedChildMessage: string;
  fromParentmessageToSendChild: string = 'From Parent Default Value';

  constructor() { }

  ngOnInit() {
  }

  sendToChild(message: string) {
    this.fromParentmessageToSendChild = message;
  }

  getMessage(message: string) {
    this.receivedChildMessage = message;
  }

}
