import { Component } from '@angular/core';
import { EmployeeComponent } from './employee/app.employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']

})
export class AppComponent {
  title = 'My First Angular ';
  childValue: string = 'value From Parent';

  constructor() {
    //this.doAsyncTask(() => console.log("Callback Called"));
    
    //this.doAsyncTask();
    
    //this.doAsyncTask().then(() => console.log("Task Complete!"));



    // this.doAsyncTask().then(
    //   () => console.log("Task Complete!"),
    //   () => console.log("Task Errored!"),
    // );
  }

  // doAsyncTask(cb) {
  //   setTimeout
  //     (() => {
  //       console.log("Async Task Calling Callback");
  //       cb();
  //     }, 1000
  //     );
  // }


  // doAsyncTask() {
  //   var promise = new Promise((resolve, reject) => {
  //     setTimeout(() => {
  //       console.log("Async Work Complete");
  //       resolve();
  //     }, 1000);
  //   });
  //   return promise;
  // }


  // doAsyncTask() {
  //   var promise = new Promise((resolve, reject) => {
  //     setTimeout(() => {
  //       console.log("Async Work Complete");
  //       if (!true) {
  //         reject();
  //       } else {
  //         resolve();
  //       }
  //     }, 1000);
  //   });
  //   return promise;
  // }
}
