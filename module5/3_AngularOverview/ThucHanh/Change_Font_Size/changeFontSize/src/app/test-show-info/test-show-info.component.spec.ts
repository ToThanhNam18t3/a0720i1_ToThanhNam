import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TestShowInfoComponent } from './test-show-info.component';

describe('TestShowInfoComponent', () => {
  let component: TestShowInfoComponent;
  let fixture: ComponentFixture<TestShowInfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TestShowInfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TestShowInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
