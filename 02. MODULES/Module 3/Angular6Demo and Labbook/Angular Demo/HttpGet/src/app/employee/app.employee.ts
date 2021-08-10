import { Component, OnInit, Input } from '@angular/core';
import { Employee } from '../empModel';

@Component({
  selector: 'app-employee',
  templateUrl: './app.empolyee.html',
  })
export class EmployeeComponent{
  employeeVar = 'My Employee Component ';

  @Input()
  childComponent : string;

  isDisabled : boolean = false;
  isDis : string = 'false';

  public empObj : Employee;

  constructor()
  {
    this.empObj = new Employee();
    this.empObj.empId = 1001;
    this.empObj.empname='Mohammed';
    this.empObj.empSalary=12000;
    //this.display();
  }

  ngOnInit()
  {
    this.display();
  }

  display(): void
  {
    console.log(this.empObj.empname + ' is displayed')
  }
// Method Invokation in Interpolation Example
  changed()
  {
    alert('This is data Displayed');
  }
  clicked(event)
  {
    console.log(event);
  }
  //  Event Example
  public text: String = 'Text Not submitted yet.';
  public x: Number;
  public y: Number;

  submit($event: Event) {
    this.text = 'Text Submitted successfully!';
    console.log($event);
  }

  mouseMove($event: MouseEvent) {
    this.x = $event.x;
    this.y = $event.y;
  }
}
// (focus)="method()"
// (blur)="method()"

// (submit)="method()"

// (scroll)="method()"

// (cut)="method()"
// (copy)="method()"
// (paste)="method()"

// (keydown)="method()"
// (keypress)="method()"
// (keyup)="method()"

// (mouseenter)="myMethod()"
// (mousedown)="myMethod()"
// (mouseup)="myMethod()"

// (click)="myMethod()"
// (dblclick)="myMethod()"

// (drag)="myMethod()"
// (dragover)="myMethod()"
// (drop)="myMethod()"