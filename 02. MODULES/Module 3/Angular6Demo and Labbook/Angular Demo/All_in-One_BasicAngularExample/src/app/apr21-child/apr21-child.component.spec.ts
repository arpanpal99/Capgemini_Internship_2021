import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Apr21ChildComponent } from './apr21-child.component';

describe('Apr21ChildComponent', () => {
  let component: Apr21ChildComponent;
  let fixture: ComponentFixture<Apr21ChildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Apr21ChildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Apr21ChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
