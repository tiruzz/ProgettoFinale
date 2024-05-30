import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegistrazioneComponent } from './registrazione/registrazione.component';

export const routes: Routes = [
    {path: 'Login', component: LoginComponent},
    {path: 'Home', component: HomeComponent},
    {path: 'Registrati', component: RegistrazioneComponent },
    {path: '', redirectTo: '/Login', pathMatch: 'full' }
];