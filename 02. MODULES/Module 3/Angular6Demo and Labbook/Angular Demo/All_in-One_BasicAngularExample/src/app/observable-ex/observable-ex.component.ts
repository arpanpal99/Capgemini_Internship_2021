import { Component, OnInit } from '@angular/core';
import { Observable, interval } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { take, map } from 'rxjs/operators';

@Component({
  selector: 'app-observable-ex',
  templateUrl: './observable-ex.component.html',
  styleUrls: ['./observable-ex.component.css']
})
export class ObservableExComponent implements OnInit {

  apiData: any;
  numbers = interval(1000);

  constructor(public http: HttpClient) {
    //this.getApiData();
    this.getData();
  }

  ngOnInit() {
  }

  public getApiData(): Observable<any> {
    return this.apiData = this.http.get<any>('https://jsonplaceholder.typicode.com/posts');
  }

  getData() {
    const takeThree = this.numbers.pipe(
      take(10),
      map((v) => Date.now())
    );

    takeThree.subscribe(value => console.log("Subscriber: " + value));
  }

}
