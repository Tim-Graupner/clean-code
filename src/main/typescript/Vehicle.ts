import { Color } from './Color';

export interface Vehicle {
    readonly vin: string;
    readonly blacklisted: boolean;
    readonly make?: string;
    readonly model?: string;
    readonly year?: number;
    readonly miles?: number;
    readonly color?: Color;
}
