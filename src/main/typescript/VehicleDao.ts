import { Vehicle } from './Vehicle';

export interface VehicleDao {
    expectToFindOne(vin : string) : Vehicle;
}
