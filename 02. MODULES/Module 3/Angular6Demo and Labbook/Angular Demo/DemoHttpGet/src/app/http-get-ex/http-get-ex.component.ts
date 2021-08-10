import { Component, OnInit } from '@angular/core';
import { EmployeeSer } from '../emp';
import { ProductService } from '../product.service';
import { darkorchid } from 'color-name';

@Component({
  selector: 'app-http-get-ex',
  templateUrl: './http-get-ex.component.html',
  styleUrls: ['./http-get-ex.component.css']
})
export class HttpGetExComponent implements OnInit {

  employees: EmployeeSer[];
  employee : EmployeeSer;
  constructor(private prodService: ProductService) { }

  ngOnInit(): void {
    this.getEmpListByHttp();
  }

  getEmpListByHttp() {
    this.prodService.getEmpListByHttp().subscribe((empdata: EmployeeSer[]) => {
      this.employees = empdata;
    });
  }

  postEmp(){
    this.prodService.postEmp().subscribe((dataEmp: EmployeeSer)=>{
      console.log(dataEmp);
      this.employee=dataEmp;
    });
  }

delEmp(id:number){
  this.prodService.delEmp(id).subscribe( ()=>{
    this.getEmpListByHttp();
  });
}

}
