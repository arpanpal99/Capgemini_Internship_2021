import { Component, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import { AppState } from '../../app.state';
import { CreateCustomer } from '../../actions/customer.actions';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {

  constructor(private store: Store<AppState>) { }

  ngOnInit() {
  }

  saveCustomer(id, name, age) {
    this.store.dispatch(new CreateCustomer(
      {
        id: id,
        name: name,
        age: age,
        active: false
      }
    ));
  }
}
