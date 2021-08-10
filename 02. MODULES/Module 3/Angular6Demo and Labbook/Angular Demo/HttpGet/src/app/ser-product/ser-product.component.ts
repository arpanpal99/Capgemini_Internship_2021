import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';
import { IProduct } from '../product';

@Component({
  selector: 'app-ser-product',
  templateUrl: './ser-product.component.html',
  styleUrls: ['./ser-product.component.css']
})
export class SerProductComponent implements OnInit {

 products : IProduct[];

  constructor(private prodservice : ProductService) { }

  ngOnInit() {
    this.products = this.prodservice.getAllProducts();
  }


}
