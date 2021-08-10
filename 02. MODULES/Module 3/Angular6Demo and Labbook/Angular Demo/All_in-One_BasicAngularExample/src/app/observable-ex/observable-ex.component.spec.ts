import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ObservableExComponent } from './observable-ex.component';

describe('ObservableExComponent', () => {
  let component: ObservableExComponent;
  let fixture: ComponentFixture<ObservableExComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ObservableExComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ObservableExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
