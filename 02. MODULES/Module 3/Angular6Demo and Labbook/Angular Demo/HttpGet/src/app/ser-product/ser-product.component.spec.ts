import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SerProductComponent } from './ser-product.component';

describe('SerProductComponent', () => {
  let component: SerProductComponent;
  let fixture: ComponentFixture<SerProductComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SerProductComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SerProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
