import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-own-directive-ex',
  templateUrl: './own-directive-ex.component.html',
  styleUrls: ['./own-directive-ex.component.css']
})
export class OwnDirectiveExComponent implements OnInit {

    //@HostListener Example
    color : string;

    constructor() { }

  ngOnInit() {
  }

}
