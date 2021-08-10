import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AddemployeeComponent } from './add-employee/add-employee.component';
import { EditemployeeComponent } from './edit-employee/edit-employee.component';
import { ListemployeeComponent } from './list-employee/list-employee.component';
import { EmployeeService } from './employee.service';
import { HttpClientModule } from '@angular/common/http';
//import { PostcompComponent } from './postcomp/postcomp.component';

@NgModule({
  declarations: [
    AppComponent,
   // LoginComponent,
    AddemployeeComponent,
    EditemployeeComponent,
    ListemployeeComponent
  //  PostcompComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
 ReactiveFormsModule,HttpClientModule
  ],
  providers: [EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
