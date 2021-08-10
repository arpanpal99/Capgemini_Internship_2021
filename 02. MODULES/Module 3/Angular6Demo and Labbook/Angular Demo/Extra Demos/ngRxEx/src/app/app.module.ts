import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { StoreModule } from '@ngrx/store';
import { reducer } from './reducers/customer.reducer';

import { AppComponent } from './app.component';
import { CreateCustomerComponent } from './customers/create-customer/create-customer.component';
import { CustomersListComponent } from './customers/customers-list/customers-list.component';
import { CustomerDetailsComponent } from './customers/customer-details/customer-details.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateCustomerComponent,
    CustomersListComponent,
    CustomerDetailsComponent
  ],
  imports: [
    BrowserModule,
    StoreModule.forRoot({
      customer: reducer
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
