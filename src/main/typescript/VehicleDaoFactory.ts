import { VehicleDao } from './VehicleDao';
import { VehicleInMemoryDao } from './VehicleInMemoryDao';

export class VehicleDaoFactory {

    private static vehicleDao: VehicleDao;

    public static getVehicleDao(): VehicleDao {
        if (VehicleDaoFactory.vehicleDao === undefined)
            VehicleDaoFactory.vehicleDao = VehicleDaoFactory.usingVehicleInMemoryDao();
        return VehicleDaoFactory.vehicleDao;
    }

    private static usingVehicleInMemoryDao(): VehicleDao {
        return new VehicleInMemoryDao();
    }

    private constructor() {

    }

}