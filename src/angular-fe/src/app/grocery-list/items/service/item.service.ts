import { HttpHeaders } from '@angular/common/http';
import { HttpClient } from "@angular/common/http";
import { Injectable } from '@angular/core';
import { Item } from "../../../item";

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  private itemsUrl = "/api/items";

  constructor(private http: HttpClient) {
  }

  getAllItems() {
    return this.http.get(this.itemsUrl);
  }

  setItem()
}
