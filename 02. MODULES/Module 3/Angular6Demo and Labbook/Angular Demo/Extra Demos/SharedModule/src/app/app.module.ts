import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { SharedModule } from './shared/shared.module';

import { AppComponent } from './app.component';
import { HelloComponent } from './hello.component';
import { HeaderComponent } from './shared/header/header.component';

@NgModule({
  imports:      [ BrowserModule, FormsModule, SharedModule],
  declarations: [ AppComponent, HelloComponent],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
