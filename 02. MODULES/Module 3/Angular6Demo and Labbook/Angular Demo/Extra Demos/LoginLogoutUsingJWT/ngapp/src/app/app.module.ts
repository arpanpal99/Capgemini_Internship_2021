import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { BooksComponent } from './books/books.component';
import { SpecialbooksComponent } from './specialbooks/specialbooks.component';
import { HttpClientModule , HTTP_INTERCEPTORS } from '@angular/common/http';
import { AuthService } from './auth.service';
import { BooksService } from './books.service';
import { AuthGuard } from './auth.guard';
import { TokenInterceptorService } from './token-interceptor.service';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginComponent,
    BooksComponent,
    SpecialbooksComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [AuthService, AuthGuard, BooksService, 
    {
      provide : HTTP_INTERCEPTORS,
      useClass : TokenInterceptorService, 
      multi : true
    }],
  bootstrap: [AppComponent]
})
export class AppModule { }
