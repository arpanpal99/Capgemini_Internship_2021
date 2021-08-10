import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SpecialbooksComponent } from './specialbooks.component';

describe('SpecialbooksComponent', () => {
  let component: SpecialbooksComponent;
  let fixture: ComponentFixture<SpecialbooksComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SpecialbooksComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SpecialbooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
