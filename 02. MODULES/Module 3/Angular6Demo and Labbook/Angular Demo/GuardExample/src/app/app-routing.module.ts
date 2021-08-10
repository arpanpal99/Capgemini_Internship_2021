import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductComponent } from './product/product.component';
import { LoginComponent } from './login/login.component';
import { AuthGuardService } from './auth-guard.service';
import { ErrorComponent } from './error/error.component';


export const routes: Routes = [
  { path: 'login', component:LoginComponent},
  { path: 'error', component:ErrorComponent},
  { path: 'product', component: ProductComponent, canActivate : [AuthGuardService] },
  { path: '', redirectTo: 'login', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
