import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Injectable} from '@angular/core';
import {Item} from './item'
import {Observable} from "rxjs";

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable({
  providedIn: 'root'
})

export class ItemService {

  private itemsUrl = "/api/items";

  constructor(private http: HttpClient) {
  }

  getItems(): Observable<Item[]> {
      return this.http.get<Item[]>(this.itemsUrl);

  }

  addItem(item: Item): Observable<Item> {
     return this.http.post<Item>(this.itemsUrl, item, httpOptions);
  }


}
