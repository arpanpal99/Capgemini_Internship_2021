import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-if-example',
  templateUrl: './ng-if-example.component.html',
  styleUrls: ['./ng-if-example.component.css']
})
export class NgIfExampleComponent implements OnInit {

  isValid: boolean = true;

  constructor() { }

  ngOnInit() {
  }

  ChangeData(valid: boolean) {
    this.isValid = valid;
  }

}
