import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-http-get-ex',
  templateUrl: './http-get-ex.component.html',
  styleUrls: ['./http-get-ex.component.css']
})
export class HttpGetExComponent implements OnInit {

  employees: Employee[];
  posts;

  constructor(private prodService: ProductService) { }

  ngOnInit(): void {
    this.prodService.getEmpListByHttp().subscribe((empdata) => {
      this.employees = empdata;
    });

    // this.prodService.getPosts()
    //   .subscribe(response => {
    //     this.posts = response;
    //   });
  }

  // deleteItem(post) {
  //   this.prodService.deletePost(post.id).subscribe(response => {
  //     this.posts = this.posts.filter(item => item.id !== post.id);
  //   });
  // }
}
