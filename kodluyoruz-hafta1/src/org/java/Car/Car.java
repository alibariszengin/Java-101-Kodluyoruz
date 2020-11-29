package org.java.Car;

public class Car {

    public String model;
    public int km;
    public int fiyat;

    public Car(){
        model = " - ";
        Printcar(model,km,fiyat);
    }
    public Car(String model){
        this.model =model;
        Printcar(model,km,fiyat);
    }
    public Car(String model,int km,int fiyat){
        this.model =model;
        this.km=km;
        this.fiyat=fiyat;
        Printcar(model,km,fiyat);
    }
    public void Printcar(String model,int km,int fiyat){
        System.out.printf("Aracin modeli : %s \n" +
                "Aracin km sayasi : %d \n" +
                "Aracin fiyati : %d\n",model,km,fiyat);
    }


}
