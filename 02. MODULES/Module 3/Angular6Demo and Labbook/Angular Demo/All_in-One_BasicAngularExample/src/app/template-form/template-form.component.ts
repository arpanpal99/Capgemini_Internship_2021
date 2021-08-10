import { Component, OnInit } from '@angular/core';
import { EmployeeModelForm } from '../EmployeeForm';
import { DepartmentModelForm } from '../DepartmentForm';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-template-form',
  templateUrl: './template-form.component.html',
  styleUrls: ['./template-form.component.css']
})
export class TemplateFormComponent implements OnInit {

  emp: EmployeeModelForm = {
    eId: null,
    eName: null,
    eSalary: null,
    eType: null,
    eDepartment: null,
    eskill: null
  };

  dept: DepartmentModelForm[] = [
    { dId: 1, dName: "Java" },
    { dId: 2, dName: ".Net" },
    { dId: 3, dName: "Mainframe" },
    { dId: 4, dName: "BI" }
  ];

  constructor() { }

  ngOnInit() {
  }

  getData(employeeForm: NgForm): void {
    console.log(employeeForm.value);
  }

}
