public class Client {

    private String name, surname;
    int birthYear;
    int clientID;
    int amountOfRentedCars;
    Car rentedCars[];

    public Client(String name, String surname, int birthYear){
        this.name=name;
        this.surname=surname;
        this.birthYear=birthYear;
    }

    public void rentCar(Car car){
        car.isRented=true;
        System.out.println(name + " rented " + car.carName());
    }

    public void returnCar(Car car){
        car.isRented=false;
        System.out.println(name + " returned " + car.carName());
    }

    @Override
    public String toString() {
        return "Name: " + name + " " + surname + "\nBirth year: " + birthYear;
    }

}