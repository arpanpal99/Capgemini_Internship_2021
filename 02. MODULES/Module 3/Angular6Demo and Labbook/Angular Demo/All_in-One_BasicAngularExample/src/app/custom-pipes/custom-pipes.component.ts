import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';


@Component({
  selector: 'app-custom-pipes',
  templateUrl: './custom-pipes.component.html',
  styleUrls: ['./custom-pipes.component.css']
})
export class CustomPipesComponent implements OnInit {

  args : string = '';

  employees : Employee[] =[
    {empId:1001,empName:'Mohammed',empSal:15000,empDep:'JAVA',empjoiningdate:'6/12/2018'},
    {empId:1002,empName:'Vikash',empSal:11000,empDep:'ORAAPS',empjoiningdate:'6/12/2017'},
    {empId:1003,empName:'Uma',empSal:12000,empDep:'JAVA',empjoiningdate:'6/12/2010'},
    {empId:1004,empName:'Sachin',empSal:11500,empDep:'ORAAPS',empjoiningdate:'11/12/2017'},
    {empId:1005,empName:'Amol',empSal:7000,empDep:'.NET',empjoiningdate:'1/1/2018'},
    {empId:1006,empName:'Vishal',empSal:17000,empDep:'BI',empjoiningdate:'9/12/2012'},
    {empId:1007,empName:'Rajita',empSal:21000,empDep:'BI',empjoiningdate:'6/7/2014'},
    {empId:1008,empName:'Neelima',empSal:81000,empDep:'TESTING',empjoiningdate:'6/17/2015'},
    {empId:1009,empName:'Daya',empSal:1000,empDep:'TESTING',empjoiningdate:'6/17/2016'},
   

  ];
  constructor() { }

  ngOnInit() {
  }

}
