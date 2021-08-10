import { Injectable } from '@angular/core';
import { IProduct } from './product';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { EmployeeSer } from './emp';
import { Observable } from 'rxjs';

const headerConf = {
  headers : {'Content-type' : 'application/json'}
}

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  emp: EmployeeSer;

  uri = 'http://localhost:3000/employees';
  //uri = 'assets/employee.json';

  constructor(private http: HttpClient) { }

  postData = {
    "id": 5,
    "empName": "Md Alim",
    "empSalary": "44000",
    "empDepartment": "Mech"
  }

  getAllProducts(): IProduct[] {
    return [
      { prodId: 1001, prodName: 'Mobile', prodPrice: 12000 },
      { prodId: 1002, prodName: 'Laptop', prodPrice: 32000 },
      { prodId: 1003, prodName: 'Desktop', prodPrice: 8000 }
    ];
  }

  getEmpListByHttp(): Observable<EmployeeSer[]> {
    return this.http.get<EmployeeSer[]>(this.uri);
  }

  postEmp() :Observable<EmployeeSer> {
     return this.http.post<EmployeeSer>(this.uri, this.postData, headerConf);
  }

  delEmp(id:number) : Observable<EmployeeSer> {
      return this.http.delete<EmployeeSer>(this.uri+'/'+id, headerConf);
  }

}
