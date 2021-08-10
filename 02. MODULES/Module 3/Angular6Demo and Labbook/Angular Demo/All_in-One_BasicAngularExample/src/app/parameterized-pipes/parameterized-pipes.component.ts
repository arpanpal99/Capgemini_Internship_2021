import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parameterized-pipes',
  templateUrl: './parameterized-pipes.component.html',
  styleUrls: ['./parameterized-pipes.component.css']
})
export class ParameterizedPipesComponent implements OnInit {

  //we can pass any number of parameters to the pipe using a colon (:) 
  //and when we do so, it is called Angular Parameterized Pipes. 
  today: number = Date.now();

  constructor() { }

  ngOnInit() {
  }

}
