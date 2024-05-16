import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlaylistpersonaliComponent } from './playlistpersonali.component';

describe('PlaylistpersonaliComponent', () => {
  let component: PlaylistpersonaliComponent;
  let fixture: ComponentFixture<PlaylistpersonaliComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PlaylistpersonaliComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PlaylistpersonaliComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
