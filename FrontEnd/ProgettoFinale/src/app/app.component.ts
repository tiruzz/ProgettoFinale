import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {MatCardModule} from '@angular/material/card';
import {MatIconModule} from '@angular/material/icon';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule, MatCardModule, MatIconModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ProgettoFinale';

  canzoni = [
    {titolo:'Baby Mama', artista:'Don Pero', immagine:'https://i.scdn.co/image/ab67616d0000b2731f5185de4c80542dc1d79e8e',},
    {titolo:'00', artista:'Artie 5ive', immagine:'https://is1-ssl.mzstatic.com/image/thumb/Music221/v4/aa/3b/83/aa3b83d3-e779-5211-6823-b9502e41b9a1/5021732271686.jpg/1200x1200bf-60.jpg',},
    {titolo:'BRNBQ', artista:'Sfera Ebbasta', immagine:'./assets/londra.png',},
    {titolo:'Visiera A Becco', artista:'Sfera Ebbasta', immagine:'./assets/barcellona.png',},
    {titolo:'VDLC', artista:'Sfera Ebbasta', immagine:'./assets/roma.png', abitanti: '2,161 milioni',},
    
    ]
}
