import { Customer } from './customers/models/customer';

export interface AppState {
    readonly customer: Customer[];
}
