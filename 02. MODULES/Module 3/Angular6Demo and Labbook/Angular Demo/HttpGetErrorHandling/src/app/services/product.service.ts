import { Injectable } from '@angular/core';
import { IProduct } from '../product';
import { Observable, throwError } from 'rxjs';
import { Employee } from '../employee';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private url = 'https://jsonplaceholder.typicode.com/posts';

  constructor(private httpClient: HttpClient) {
    this.getEmpListByHttp().subscribe((empData) => {
      console.log(empData);
    })
  }

  getAllProducts(): IProduct[] {
    return [
      { prodId: 1, prodName: 'Mobile', prodPrice: 1000 },
      { prodId: 2, prodName: 'TV', prodPrice: 1940 },
      { prodId: 3, prodName: 'Books', prodPrice: 1800 }

    ];
  }

  getEmpListByHttp(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>('assets/employee1.json').pipe(catchError(this.handleError));
  }

  getPosts() {
    return this.httpClient.get(this.url);
  }

  deletePost(id) {
    return this.httpClient.delete(this.url + '/' + id);
  }

  private handleError(error: HttpErrorResponse){
    if(error.error instanceof ErrorEvent){
        console.error('Client Side Error: ' , error.error.message);
    }else{
      console.error('Server Side Error: ', error);
    }
    return throwError('There is problem with Service');
  }

}
