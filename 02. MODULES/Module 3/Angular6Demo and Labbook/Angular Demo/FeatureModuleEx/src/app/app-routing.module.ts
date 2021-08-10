import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CustomersModule } from './customers/customers.module';
import { OrdersModule } from './orders/orders.module';


const routes: Routes = [
  {
    path: 'customers',
    //loadChildren: './customers/customers.module#CustomersModule'
    loadChildren : ()=>import('src/app/customers/customers.module').then(m=>CustomersModule)
  },
  {
    path: 'orders',
    loadChildren:()=>import('src/app/orders/orders.module').then(m=>OrdersModule)
  },
  {
    path: '',
    redirectTo: '',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule],
  providers: []
})
export class AppRoutingModule { }


/*
Copyright 2017-2018 Google Inc. All Rights Reserved.
Use of this source code is governed by an MIT-style license that
can be found in the LICENSE file at http://angular.io/license
*/