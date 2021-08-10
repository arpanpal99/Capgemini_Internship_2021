import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Store } from '@ngrx/store';

import { Customer } from '../models/customer';
import { AppState } from '../../app.state';

@Component({
  selector: 'app-customers-list',
  templateUrl: './customers-list.component.html',
  styleUrls: ['./customers-list.component.css']
})
export class CustomersListComponent implements OnInit {

  customers: Observable<Customer[]>;

  constructor(private store: Store<AppState>) {
    this.customers = store.select('customer');
  }

  ngOnInit() {
  }

}
