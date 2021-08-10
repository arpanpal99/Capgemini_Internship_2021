import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
//import 'rxjs/add/observable/of';
//import 'rxjs/add/operator/map';
import { of } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable()
export class AuthService {

    private isloggedIn: boolean;
    private userName: string;

    constructor() {
        this.isloggedIn = false;
    }

    login(username: string, password: string) {

        //Assuming users are provided the correct credentials.
        //In real app you will query the database to verify.
        if (username == "Admin" && password == "Admin") {
            this.isloggedIn = true;
            this.userName = username;
            return of(this.isloggedIn);
        } else {
            return of(!this.isloggedIn);
        }
    }

    isUserLoggedIn(): boolean {
        return this.isloggedIn;
    }

    logoutUser(): void {
        this.isloggedIn = false;
    }

} 