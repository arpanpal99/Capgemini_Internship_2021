import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

    invalidCredentialMsg: boolean;
    username: string;
    password: string;
    // retUrl:string="login";

    constructor(private authService: AuthService,
        private router: Router,
        private activatedRoute: ActivatedRoute) {
    }

    ngOnInit() {

    }

    onFormSubmit(loginForm) {
        this.authService.login(loginForm.value.username, loginForm.value.password).subscribe(data => {
            this.invalidCredentialMsg = data;
            if (this.invalidCredentialMsg == true) {
                console.log(this.invalidCredentialMsg);
                this.router.navigate(['product']);
            } else {
                this.router.navigate(['error']);
            }
        });
    }
} 
