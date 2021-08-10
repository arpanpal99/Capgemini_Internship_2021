import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from "@angular/forms"; 
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';

import { ProductService } from './services/product.service';
import { HttpGetExComponent} from './http-get-ex/http-get-ex.component';


@NgModule({
  declarations: [
    AppComponent, HttpGetExComponent
  ],
  imports: [
    BrowserModule, FormsModule, HttpClientModule, ReactiveFormsModule ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
