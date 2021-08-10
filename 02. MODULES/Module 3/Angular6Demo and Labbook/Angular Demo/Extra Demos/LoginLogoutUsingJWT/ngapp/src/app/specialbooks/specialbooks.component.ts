import { Component, OnInit } from '@angular/core';
import { BooksService } from '../books.service';
import { HttpErrorResponse } from '@angular/common/http';
import { Router } from '@angular/router';


@Component({
  selector: 'app-specialbooks',
  templateUrl: './specialbooks.component.html',
  styleUrls: ['./specialbooks.component.scss']
})
export class SpecialbooksComponent implements OnInit {

  specialBooksList =[]
  constructor(private _booksService : BooksService, private _router : Router) { }

  ngOnInit() {
    this._booksService.getSpecialBooks()
    .subscribe(
      res=>this.specialBooksList=res,
      err=>{
        console.log(err)
      if(err instanceof HttpErrorResponse)
      {
        if(err.status == 401)
        {
          this._router.navigate(['./login'])  
        }
        }
      }
    )  
  }
}