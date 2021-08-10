import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from "@angular/forms"; 
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/app.employee';
import { HttpClientModule } from '@angular/common/http';

import { ProductService } from './services/product.service';
import { HttpGetExComponent} from './http-get-ex/http-get-ex.component';
import { SerProductComponent } from './ser-product/ser-product.component';

@NgModule({
  declarations: [
    AppComponent,EmployeeComponent, HttpGetExComponent, SerProductComponent
  ],
  imports: [
    BrowserModule, FormsModule, HttpClientModule, ReactiveFormsModule ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
