import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AnimationExComponent } from './animation-ex.component';

describe('AnimationExComponent', () => {
  let component: AnimationExComponent;
  let fixture: ComponentFixture<AnimationExComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AnimationExComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AnimationExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
