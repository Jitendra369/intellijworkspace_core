package ProjectsCore.ParkingSport.entity;

import ProjectsCore.ParkingSport.model.ParkingSpotPrice;
import ProjectsCore.ParkingSport.model.Vehical;
import ProjectsCore.ParkingSport.model.VehicalType;

import java.util.SplittableRandom;

public class ParkingSpot {

    private int parkingSpotID;
    private boolean isAvaliable;
    private Vehical vehical;
    private int price;
    private VehicalType vehicalType;

    public ParkingSpot() {

    }

    public ParkingSpot(int parkingSpotID, boolean isAvaliable, Vehical vehical, int price, VehicalType vehicalType) {
        this.parkingSpotID = parkingSpotID;
        this.isAvaliable = isAvaliable;
        this.vehical = vehical;
        this.price = price;
        this.vehicalType = vehicalType;
    }

    //    park the vehical
    public void parkVehical(Vehical vehical){
        isAvaliable = false;
        this.vehical = vehical;
    }

//    remove the vehical
    public void removeVehical(){
        this.vehical = null;
        isAvaliable = false;
    }




}
