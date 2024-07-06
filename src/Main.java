import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //Frame frame = new Frame();
            }
        });

        Car cars[] = {
                new Car("Mercedes","AMG GTR", engineType.COMBUSTION, 2022,"Germany",50000, false, condition.USED),
                new Car("BMW","i8",engineType.COMBUSTION,2021,"Germany",40000, false, condition.NEW),
                new Car("Tesla","Y",engineType.ELECTRIC,2024,"USA",35000, false, condition.NEW),
                new Car("Volvo","",engineType.COMBUSTION,2015,"Sweden",20000, false, condition.USED)
        };

        Client clients[] = {
                new Client("Jack","Smith",1998),
                new Client("Łukasz","Arakelyan",2002),
        };

        clients[0].rentCar(cars[2]);
        clients[1].rentCar(cars[2]);

        if(cars[2].isRented==true){

        }

    }
}