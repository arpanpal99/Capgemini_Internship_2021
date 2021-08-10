import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Emp21Component } from './emp21.component';

describe('Emp21Component', () => {
  let component: Emp21Component;
  let fixture: ComponentFixture<Emp21Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Emp21Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Emp21Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
