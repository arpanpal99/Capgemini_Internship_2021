import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-way-binding',
  templateUrl: './two-way-binding.component.html',
  styleUrls: ['./two-way-binding.component.css']
})
export class TwoWayBindingComponent implements OnInit {

  id: number = null;
  userName: String = 'Ishaque';
  city : String = null;

  constructor() { 
    
  }

  ngOnInit() {
  }

  // updateData(event){
  //   this.userName = event.target.value;
  //   console.log(event.target.value)
  // }
  display()
  {
    console.log(this.id+' '+this.city)
  }
}
