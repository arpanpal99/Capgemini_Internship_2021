import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-switch-example',
  templateUrl: './ng-switch-example.component.html',
  styleUrls: ['./ng-switch-example.component.css']
})
export class NgSwitchExampleComponent implements OnInit {

  public dropDownValue = '';

  constructor() { }

  ngOnInit() {
  }

  SetDropSownValue(dropvalue : any){
      this.dropDownValue = dropvalue.target.value;      
  }

}
