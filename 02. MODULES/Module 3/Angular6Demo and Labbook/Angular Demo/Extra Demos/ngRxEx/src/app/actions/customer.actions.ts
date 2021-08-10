import { Injectable } from '@angular/core';
import { Action } from '@ngrx/store';
import { Customer } from '../customers/models/customer';

export const CREATE_CUSTOMER = 'Customer_Create';
export const DELETE_CUSTOMER = 'Customer_Delete';

export class CreateCustomer implements Action {
    readonly type = CREATE_CUSTOMER;

    constructor(public payload: Customer) { }
}

export class DeleteCustomer implements Action {
    readonly type = DELETE_CUSTOMER;

    constructor(public id: string) { }
}

export type Actions = CreateCustomer | DeleteCustomer;
