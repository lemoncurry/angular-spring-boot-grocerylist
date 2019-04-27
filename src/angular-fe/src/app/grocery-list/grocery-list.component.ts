import {Component, OnInit, ViewChild} from '@angular/core';
import {ItemsComponent} from './items/items.component';

@Component({
  selector: 'app-grocery-list',
  templateUrl: './grocery-list.component.html',
  styleUrls: ['./grocery-list.component.css']
})
export class GroceryListComponent implements OnInit {

  private collapsed = true;

  @ViewChild('itemsC')
  itemsC: ItemsComponent;

  constructor() { }

  ngOnInit() {
  }

  toggleCollapsed(): void {
    this.collapsed = !this.collapsed;
  }

}
