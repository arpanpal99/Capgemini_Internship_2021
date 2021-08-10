import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BooksService {

  private _eventsUrl = "http://localhost:3000/api/books"
  private _specialBooksUrl = "http://localhost:3000/api/specialBooks"

  constructor(private http : HttpClient) { }

  getBooks()
  {
    return this.http.get<any>(this._eventsUrl)
  }

  getSpecialBooks()
  {
    return this.http.get<any>(this._specialBooksUrl)
  }

}
