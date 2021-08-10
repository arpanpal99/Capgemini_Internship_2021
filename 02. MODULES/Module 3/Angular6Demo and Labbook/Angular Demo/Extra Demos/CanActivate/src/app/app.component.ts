import { Component } from '@angular/core';
import { AuthService } from './auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'CanActivate Example';
 
  constructor (private authService:AuthService, 
               private router:Router) {
  }
 
  logout() {
    this.authService.logoutUser();
    this.router.navigate(['login']);
  }
 
}