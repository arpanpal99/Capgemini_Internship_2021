import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OwnDirectiveExComponent } from './own-directive-ex.component';

describe('OwnDirectiveExComponent', () => {
  let component: OwnDirectiveExComponent;
  let fixture: ComponentFixture<OwnDirectiveExComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OwnDirectiveExComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OwnDirectiveExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
