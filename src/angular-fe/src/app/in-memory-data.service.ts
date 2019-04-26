import { InMemoryDbService } from "angular-in-memory-web-api";
import { Injectable } from '@angular/core';
import { Item } from "./item";

@Injectable({
  providedIn: 'root'
})
export class InMemoryDataService implements InMemoryDbService {

  createDb() {
    let items = [
      {id: 11, name: 'Gurke', quantity: 2},
      {id: 12, name: 'Brot', quantity: 1},
      {id: 13, name: 'Joghurt', quantity: 3},
      {id: 14, name: 'Kötbullar', quantity: 2}
    ];
    return {items};
  }

  static genId(items: Item[]): number {
    return items.length > 0 ? Math.max(...items.map(item => item.id)) + 1 : 11;
  }
}
