import { Component, OnInit } from '@angular/core';

import { User } from './shared/models/user.model';

@Component({
  selector: 'my-app',
  templateUrl: './app.component.html'
})
export class AppComponent implements OnInit {
  
  ngOnInit() {
    this.currentUser = new User();
  }
  
  currentUser: User = null;
  
  setName(newName: string) {
    this.currentUser.name = newName;
  }
  
  incrementAge() {
    this.currentUser.age++;
  }
}
