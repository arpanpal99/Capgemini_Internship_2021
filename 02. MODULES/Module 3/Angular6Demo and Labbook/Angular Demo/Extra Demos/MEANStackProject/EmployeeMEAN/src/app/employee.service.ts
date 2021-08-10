import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable()
export class EmployeeService {
  uri = 'http://localhost:4000/employees';
  //uri='http://localhost:3000/employees';

  constructor(private http: HttpClient) { }
 
  // To Get The List Of Employee
  getEmployees() {
  return this.http.get(`${this.uri}`);
  }
 
  // To Get Employee Details For Single Record Using Id
  getEmployeeById(empid) {
  return this.http.get(`${this.uri}/editEmployee/${empid}`);
  }
 
  // To Updated Specific Employee
  updateEmployee(id, body) {
  return this.http.post(`${this.uri}/updateEmployee/${id}`, body);
  }
 
  //To Create/Add New Employee
  addEmployee(body) {
  return this.http.post(`${this.uri}/addEmployee`, body);
  //return this.http.post(`${this.uri}`, body);
  }
 
  // To Delete Any Employee
  deleteEmployee(empid) {
  return this.http.get(`${this.uri}/deleteEmployee/${empid}`);
  }
 
 
 }