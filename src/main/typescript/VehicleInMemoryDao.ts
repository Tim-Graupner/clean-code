import { VehicleDao } from './VehicleDao';
import { Vehicle } from './Vehicle';
import { Color } from './Color';
import { NoSuchElementError } from './NoSuchElementError';


export class VehicleInMemoryDao implements VehicleDao {

    private readonly vehicles: Vehicle[];

    constructor() {
        this.vehicles = new Array<Vehicle>();

        this.vehicles.push({
            vin: '1HGBH41JXMN109186', blacklisted: true,
            color: Color.BLUE,
            make: 'Honda',
            model: 'Civic',
            year: 2018,
            miles: 0
        });
        this.vehicles.push({
            vin: '2HGBH41JXMN109186', blacklisted: false,
            color: Color.RED,
            make: 'Ford',
            model: 'Fusion',
            year: 2006,
            miles: 140000
        });
        this.vehicles.push({
            vin: '3HGBH41JXMN109186', blacklisted: true,
            color: Color.GREEN,
            make: 'Toyota',
            model: 'Sienna',
            year: 2014,
            miles: 60000
        });
        this.vehicles.push({
            vin: '4HGBH41JXMN109186', blacklisted: false,
            color: Color.BLUE,
            make: 'GMC',
            model: 'Terrain',
            year: 2015
        });
    }

    public expectToFindOne(vin: string): Vehicle {
        let vehiclesFound : Vehicle[] = this.vehicles.filter((vehicle : Vehicle, index : number, vehicles : Vehicle[]) => {
            return vehicle.vin.toLocaleUpperCase().localeCompare(vin) === 0;
        });

        if(vehiclesFound.length === 0){
            throw new NoSuchElementError(`this vin ${vin} wasn't found.`);
        }

        return vehiclesFound.shift();
    }

}