import { Vehicle } from './Vehicle';
import { VehicleDaoFactory } from './VehicleDaoFactory';

export class VehicleFormatter{

    private readonly vehicle : Vehicle;

    public static byVin(vin : string) : VehicleFormatter {
        return new VehicleFormatter(vin);
    }

    public toHtml() : string {
        return `
            <h1>Vehicle Details</h1>\n
            <table>\n
            <tr><th>VIN</th><th>Blacklisted</th><th>Make</th><th>Model</th><th>Year</th><th>Color</th><th>Miles</th></tr>\n
            <tr>\n
            <td>${this.vehicle.vin}</td><td>${this.vehicle.blacklisted}</td><td>${this.vehicle.make}</td><td>${this.vehicle.model}</td><td>${this.vehicle.year}</td><td>${this.vehicle.color}</td><td>${this.vehicle.miles}</td>\n
            </tr>\n
            </table>
        `;
    }

    public toMarkdown() : string {
        return `
		# Vehicle Details\n
		VIN | Blacklisted | Make | Model | Year | color | Miles\n
		--- | --- | --- | --- | --- | --- | ---\n
		${this.vehicle.vin} | ${this.vehicle.blacklisted} | ${this.vehicle.make} | ${this.vehicle.model} | ${this.vehicle.year} | ${this.vehicle.color} | ${this.vehicle.miles}
        `;
    }

    private constructor(vin : string){
        this.vehicle = VehicleDaoFactory.getVehicleDao().expectToFindOne(vin);
    }

}