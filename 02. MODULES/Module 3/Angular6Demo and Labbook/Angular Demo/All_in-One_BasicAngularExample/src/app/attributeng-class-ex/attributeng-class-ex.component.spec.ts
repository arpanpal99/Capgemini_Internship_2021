import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AttributengClassExComponent } from './attributeng-class-ex.component';

describe('AttributengClassExComponent', () => {
  let component: AttributengClassExComponent;
  let fixture: ComponentFixture<AttributengClassExComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AttributengClassExComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AttributengClassExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
