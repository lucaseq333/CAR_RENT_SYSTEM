enum engineType{
    COMBUSTION, ELECTRIC
}

enum condition{
    USED, NEW
}

public class Car {

    private String brand, model, country;
    private int yearOfProduction;
    private double price;
    boolean isRented = false;
    int carID;
    Client clientsRentQueue[];

    public Car(String brand, String model, engineType engineType, int yearOfProduction, String country, double price, boolean isRented, condition condition){
        this.brand=brand;
        this.model=model;
        this.yearOfProduction=yearOfProduction;
        this.country=country;
        this.price=price;
        this.isRented=isRented;
    }

    @Override
    public String toString() {
        return brand + " " + model + "\nProduction year: " + yearOfProduction + "\nCountry: " + country + "\nPrice: " + price + "\nIs rented: " + isRented;
    }

    public void rentedBy(Client client){

    }

    public void addToQueue(){

    }

    public String carName(){
        return brand + " " + model;
    }

}