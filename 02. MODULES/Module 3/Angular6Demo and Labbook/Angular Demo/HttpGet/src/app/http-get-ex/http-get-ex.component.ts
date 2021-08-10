import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-http-get-ex',
  templateUrl: './http-get-ex.component.html',
  styleUrls: ['./http-get-ex.component.css']
})
export class HttpGetExComponent implements OnInit {

  employees : Employee[];

  constructor(private prodService : ProductService) { }

  ngOnInit() :void {
    this.prodService.getEmpListByHttp().subscribe((empdata)=>{
      this.employees =empdata;
    });
  }


}
