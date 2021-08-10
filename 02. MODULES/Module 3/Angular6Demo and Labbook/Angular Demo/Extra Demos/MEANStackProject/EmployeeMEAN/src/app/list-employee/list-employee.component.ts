import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {EmployeeService} from "../employee.service";
import { Employee } from '../employee';

@Component({
selector: 'app-list-employee',
templateUrl: './list-employee.component.html',
styleUrls: ['./list-employee.component.css']
})
export class ListemployeeComponent implements OnInit {

employees: Employee[];

constructor(private router: Router, private employeeservice: EmployeeService) { }

ngOnInit() {
this.getEmployees();
}

getEmployees(){
  this.employeeservice.getEmployees().subscribe( (data:Employee[]) => {
    this.employees=data;
    });
}
// Delete Employee
deleteEmployee(empid) {
  this.employeeservice.deleteEmployee(empid).subscribe(() => {
  this.getEmployees();
  });
  }


 // To Edit Employee
 editEmployee(empid) {
  this.router.navigate([`edit/${empid}`]);
  }

addemployee(): void {
this.router.navigate(['create']);
};
}