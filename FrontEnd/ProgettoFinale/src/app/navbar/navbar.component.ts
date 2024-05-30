import { Component } from '@angular/core';
import { PlaylistpersonaliComponent } from '../playlistpersonali/playlistpersonali.component';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'navbar',
  standalone: true,
  imports: [PlaylistpersonaliComponent, RouterLink],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent {

}
