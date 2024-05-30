import { Injectable } from '@angular/core';

interface Playlist {
  id: number;
  nome: string;
}

@Injectable({
  providedIn: 'root'
})
export class PlaylistService {
  private playlists: Playlist[] = [
    { id: 1, nome: 'Sei la mia Drag Queen' },
    { id: 2, nome: 'Non piangere dai' }
  ];

  getPlaylists() {
    return this.playlists;
  }

  addPlaylist(nome: string) {
    const newPlaylist = {
      id: this.playlists.length + 1,
      nome: nome
    };
    this.playlists.push(newPlaylist);
  }
}