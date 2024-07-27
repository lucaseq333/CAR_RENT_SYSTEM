import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Client {

    private String name, surname;
    int birthYear;
    int clientID;
    int amountOfRentedCars;
    Car rentedCars[];
    static Queue<String> clientQueue = new LinkedList<>();

    public Client(String name, String surname, int birthYear){
        this.name=name;
        this.surname=surname;
        this.birthYear=birthYear;
    }

    public void rentCar(Car car, Client client){
        if(car.isRented==false){
            car.isRented=true;
            System.out.println(name + " " + surname + " rented " + car.carName());
        } else {
            clientQueue.add(client.name);
            System.out.println(car.carName() + " is already rented.");
        }
    }

    public void returnCar(Car car){
        if(car.isRented==true){
            car.isRented=false;
            System.out.println(name + " " + surname + " returned " + car.carName());
        }
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public void isAdult(){
        int currentYear = 2024;
        if((currentYear-birthYear)>18){
            System.out.println("You can rent car.");
        } else System.out.println("You cannot rent car.");
    }

}