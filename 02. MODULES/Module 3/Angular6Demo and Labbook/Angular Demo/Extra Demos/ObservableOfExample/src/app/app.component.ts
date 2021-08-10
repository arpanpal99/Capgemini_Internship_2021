//https://www.techiediaries.com/rxjs-of-tutorial-and-example/

import { Component, OnInit } from '@angular/core';
import { DataService } from './data.service';

@Component({
  selector: 'app-root',
  template: `<ul>
      <li *ngFor="let product of products">
        {{product.name}} 
      </li>
  </ul>`,
  //styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Angular RxJS Examples';

  products: Array<object>;

  constructor(private dataService: DataService) { }

  ngOnInit() {
    this.dataService.get().subscribe(res => {
      this.products = res;
      console.log(res);
    });
  }
}