import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Apr21ParentComponent } from './apr21-parent.component';

describe('Apr21ParentComponent', () => {
  let component: Apr21ParentComponent;
  let fixture: ComponentFixture<Apr21ParentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Apr21ParentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Apr21ParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
