import { Injectable } from '@angular/core';
import { CanActivate, Router, UrlTree } from '@angular/router';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate {

  constructor(private router: Router, private authService: AuthService) {
  }

  canActivate(): boolean {
    if (!this.authService.isUserLoggedIn()) {
      alert('You are not allowed to view this page. You are redirected to login Page');
      this.router.navigate(["login"]);
      return false;
    }
    return true;
  }
}
