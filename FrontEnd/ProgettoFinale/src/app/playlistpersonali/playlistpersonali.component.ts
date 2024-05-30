import { Component } from '@angular/core';
import { PlaylistService } from '../playlist.service';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'playlistpersonali',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './playlistpersonali.component.html',
  styleUrl: './playlistpersonali.component.css'
})
export class PlaylistpersonaliComponent {
  playlists = this.playlistService.getPlaylists();

  constructor(private playlistService: PlaylistService) {}

  addNewPlaylist() {
    const newPlaylistName = prompt('Inserisci il nome della playlist:');
    if (newPlaylistName) {
      this.playlistService.addPlaylist(newPlaylistName);
      // Aggiorna la lista delle playlist
      this.playlists = this.playlistService.getPlaylists();
    }
  }
}
