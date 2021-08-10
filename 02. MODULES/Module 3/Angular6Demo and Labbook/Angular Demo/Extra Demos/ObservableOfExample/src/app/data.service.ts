import { Injectable } from '@angular/core';
import { of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  products: Array<object> = [
    { name: 'Product 001'},
    { name: 'Product 002'},
    { name: 'Product 003'},
    { name: 'Product 004'},
    { name: 'Product 005'}
  ];
  get() {
    return of(this.products);
  }
}