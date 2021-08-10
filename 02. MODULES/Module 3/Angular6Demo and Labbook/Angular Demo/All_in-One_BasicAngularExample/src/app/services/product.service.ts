import { Injectable } from '@angular/core';
import { IProduct } from '../product';
import { Observable } from 'rxjs';
import { Employee } from '../employee';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private httpClient : HttpClient) {
    this.getEmpListByHttp().subscribe((empData)=>{
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

  getEmpListByHttp():Observable<Employee[]>
  {
    return this.httpClient.get<Employee[]>('assets/employee.json')
  }

}
