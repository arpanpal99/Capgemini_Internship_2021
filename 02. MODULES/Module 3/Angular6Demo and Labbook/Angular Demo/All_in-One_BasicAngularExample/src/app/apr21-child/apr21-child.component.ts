import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-apr21-child',
  templateUrl: './apr21-child.component.html',
  styleUrls: ['./apr21-child.component.css']
})
export class Apr21ChildComponent implements OnInit {

  // @Input()
  // receiveParentMessage : string;

  @Output()
  messageToEmit = new EventEmitter<String>();

  messageToSendChild : string ='Hello parent';

  constructor() { }

  ngOnInit() {
  }

  sendMessageToParent(message:string){
    this.messageToEmit.emit(message);
  }

}
