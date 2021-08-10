import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from "./login/login.component";
import {AddemployeeComponent} from "./add-employee/add-employee.component";
import {ListemployeeComponent} from "./list-employee/list-employee.component";
import {EditemployeeComponent} from "./edit-employee/edit-employee.component";

const appRoutes: Routes = [
  { path: 'list', component: ListemployeeComponent },
  { path: 'create', component: AddemployeeComponent },
  { path: 'edit/:id', component: EditemployeeComponent },
  { path: '', redirectTo: '/list', pathMatch: 'full' }
];
  
  export const routing = RouterModule.forRoot(appRoutes);

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
