import { Component, OnInit } from '@angular/core';
import { BooksService } from '../books.service';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.scss']
})
export class BooksComponent implements OnInit {

  bookslist = []
  constructor(private _bookService : BooksService) { }

  ngOnInit() {
    this._bookService.getBooks().subscribe(
      res=> this.bookslist=res,
      err => console.log(err)
    )
  }
}
