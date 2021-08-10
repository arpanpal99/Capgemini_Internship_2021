import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChangeDetectChildComponent } from './change-detect-child.component';

describe('ChangeDetectChildComponent', () => {
  let component: ChangeDetectChildComponent;
  let fixture: ComponentFixture<ChangeDetectChildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChangeDetectChildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChangeDetectChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
