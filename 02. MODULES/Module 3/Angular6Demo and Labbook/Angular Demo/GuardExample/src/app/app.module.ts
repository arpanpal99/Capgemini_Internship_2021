import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { ProductComponent } from './product/product.component';
import { ProductService } from './product.service';
import { AuthService } from './auth.service';
import { AuthGuardService } from './auth-guard.service';
import { ErrorComponent } from './error/error.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ProductComponent,
    ErrorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpModule
  ],
  providers: [AuthGuardService, AuthService, ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
