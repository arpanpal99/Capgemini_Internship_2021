import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html'
})
export class HeaderComponent {
  constructor() {}
  
  @Input() name: string;
  @Output() onNameChanged = new EventEmitter<string>();
  
  changeName(newName: string) {
    this.onNameChanged.emit(newName);
  }
  
}