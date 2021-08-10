import { Component, OnInit, Input } from '@angular/core';
import { Customer } from '../models/customer';
import { Store } from '@ngrx/store';
import { AppState } from '../../app.state';
import { DeleteCustomer } from '../../actions/customer.actions';

@Component({
  selector: 'app-customer-details',
  templateUrl: './customer-details.component.html',
  styleUrls: ['./customer-details.component.css']
})
export class CustomerDetailsComponent implements OnInit {

  @Input() customer: Customer;

  constructor(private store: Store<AppState>) { }

  ngOnInit() {
  }

  removeCustomer(id) {
    this.store.dispatch(new DeleteCustomer(id));
  }
}
