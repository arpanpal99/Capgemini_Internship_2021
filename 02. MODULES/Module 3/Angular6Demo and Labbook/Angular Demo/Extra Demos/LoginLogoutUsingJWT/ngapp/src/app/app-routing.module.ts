import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BooksComponent } from './books/books.component';
import { SpecialbooksComponent } from './specialbooks/specialbooks.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './auth.guard';


const routes: Routes = [
  {
    path : '',
    redirectTo : '/books',
    pathMatch : 'full'
  },
  {
    path : 'books',
    component : BooksComponent
  },
  {
    path : 'specialBooks',
    component : SpecialbooksComponent,
    //canActivate : [AuthGuard]
  },
  {
    path : 'register',
    component : RegisterComponent
  },
  {
    path : 'login',
    component : LoginComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
