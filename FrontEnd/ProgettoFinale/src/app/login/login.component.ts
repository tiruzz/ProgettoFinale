import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { RegistrazioneComponent } from '../registrazione/registrazione.component';

@Component({
  selector: 'login',
  standalone: true,
  imports: [RouterLink, RegistrazioneComponent],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

}
