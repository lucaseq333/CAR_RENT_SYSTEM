import javax.swing.*;
import java.util.Iterator;

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
                new Car("Volvo","",engineType.COMBUSTION,2015,"Sweden",20000, false, condition.USED),
                new Car("Toyota","Corolla",engineType.COMBUSTION,2009,"Japan",20000,false,condition.USED),
                new Car("Tesla","X",engineType.ELECTRIC,2022,"USA",32000,false,condition.NEW)
        };

        Client clients[] = {
                new Client("Jack","Smith",1998),
                new Client("Łukasz","Arakelyan",2002),
                new Client("Jan","Kowalski",1994)
        };

        clients[0].rentCar(cars[2],clients[0]);
        clients[1].rentCar(cars[2],clients[1]);
        clients[2].rentCar(cars[2],clients[1]);
        clients[1].rentCar(cars[0],clients[1]);
        clients[2].rentCar(cars[0],clients[2]);
        clients[1].returnCar(cars[0]);

    }
}