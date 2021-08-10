import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FlipAnimationExComponent } from './flip-animation-ex.component';

describe('FlipAnimationExComponent', () => {
  let component: FlipAnimationExComponent;
  let fixture: ComponentFixture<FlipAnimationExComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FlipAnimationExComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FlipAnimationExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
