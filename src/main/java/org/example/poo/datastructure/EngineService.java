package org.example.poo.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EngineService {

    public static void moveVehicule(IVehicle iVehicle) {

        if(iVehicle instanceof ElectricCar){
            iVehicle.drive();
        }
        if(iVehicle instanceof PetrolCar){
            iVehicle.drive();
        }
        if(iVehicle instanceof MotorCycle){
            iVehicle.drive();
        }
        if(iVehicle instanceof SuperCar){
            iVehicle.drive();
        }

    }


    public static void test(){

        ElectricCar car = new ElectricCar("voiture1","bleue",4);
        PetrolCar car1 = new PetrolCar("voiture2",4,"rouge");
        MotorCycle car2 = new MotorCycle("voiture3",2,"gris");
        SuperCar car3 = new SuperCar();

        Engine[] engines = {car,car1,car2};

        for(Engine e : engines){
           if(e instanceof ElectricCar){
               ((ElectricCar)e).drive();
           }
           if(e instanceof PetrolCar){
               ((PetrolCar)e).drive();
           }
           if(e instanceof MotorCycle){
               ((MotorCycle)e).drive();
           }
        }

        System.out.println(Arrays.asList(engines));

        List<Engine> engineList = Arrays.asList(engines);
        List<Engine> engines1 = new ArrayList<>();
        engines1.add(car);
        engines1.add(car1);
        engines1.add(car2);

        engines1.stream().forEach(System.out::println);

        for(Engine e : engines1){
            System.out.println(e);
        }

        IVehicle[] iVehicles = {car,car1,car2,car3};

        System.out.println(Arrays.asList(iVehicles));



    }




}
