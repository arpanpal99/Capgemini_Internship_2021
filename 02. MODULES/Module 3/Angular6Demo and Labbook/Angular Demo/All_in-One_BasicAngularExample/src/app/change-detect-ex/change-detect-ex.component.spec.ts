import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChangeDetectExComponent } from './change-detect-ex.component';

describe('ChangeDetectExComponent', () => {
  let component: ChangeDetectExComponent;
  let fixture: ComponentFixture<ChangeDetectExComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChangeDetectExComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChangeDetectExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
