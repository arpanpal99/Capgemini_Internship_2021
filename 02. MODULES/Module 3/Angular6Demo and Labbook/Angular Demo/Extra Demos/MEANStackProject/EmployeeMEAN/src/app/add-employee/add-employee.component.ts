import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../employee.service";
import {first} from "rxjs/operators";
import {Router} from "@angular/router";

@Component({
selector: 'app-add-employee',
templateUrl: './add-employee.component.html',
styleUrls: ['./add-employee.component.css']
})
export class AddemployeeComponent implements OnInit {

constructor(private formBuilder: FormBuilder,private router: Router, private employeeservice: EmployeeService) { }

addForm: FormGroup;

ngOnInit() {

this.addForm = this.formBuilder.group({
  firstName: ['', [Validators.required]],
  lastName: ['', [Validators.required]],
  email: ['', [Validators.required]],
  phone: ['', [Validators.required]],
});

}
 // Add Employee When Submit Button Is Clicked
 addEmployee() {
  if (this.addForm.valid) {
  let data = this.addForm.value;
  this.employeeservice.addEmployee(data).subscribe(() => {
  this.router.navigate(['/list']);
  console.log(data);
   });
  }
  }
}