import {Component, OnInit} from '@angular/core';
import {Item} from "../../item";
import {ItemService} from "../../item.service";

@Component({
  selector: 'app-items',
  templateUrl: './items.component.html',
  styleUrls: ['./items.component.css']
})
export class ItemsComponent implements OnInit {

  items: Item[];

  constructor(private itemService: ItemService) {
  }

  ngOnInit() {
    this.getItems();
  }

  selectedItem: Item;

  onSelect(item: Item): void {
    this.selectedItem = item;
  }

  getItems(): void {
    this.itemService.getItems()
      .subscribe((items: any[]) => this.items = items);
  }

  add(name: string): void {
    name = name.trim();
    if (!name) { return; }
    this.itemService.addItem({ name } as Item)
      .subscribe(item => {
        this.items.push(item);
      });
  }

}


