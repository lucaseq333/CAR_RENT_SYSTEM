import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private Color white = new Color(255,255,255);

    public Frame(){
        setTitle("Car rental");

        DefaultListModel<String> defaultList = new DefaultListModel<>();
        defaultList.addElement("Client 1");
        defaultList.addElement("Client 2");
        defaultList.addElement("Client 3");
        defaultList.addElement("Client 4");

        JList<String> list = new JList<>();
        add(list);

        JPanel mainPanel = new JPanel();
        add(mainPanel);

        JButton btn1 = new JButton("Clients");
        JButton btn2 = new JButton("Queue");
        JButton btn3 = new JButton("For rent");
        JButton btn4 = new JButton("Rented cars");

        btn1.setBackground(white);
        btn2.setBackground(white);
        btn3.setBackground(white);
        btn4.setBackground(white);

        JPanel btnPanel = new JPanel();

        btnPanel.add(btn1);
        btnPanel.add(btn2);
        btnPanel.add(btn3);
        btnPanel.add(btn4);

        JPanel upperPanel = new JPanel();
        JPanel downPanel = new JPanel();

        upperPanel.add(btnPanel);
        btnPanel.setLayout(new GridLayout(1,4));

        mainPanel.add(upperPanel);
        mainPanel.add(downPanel);

        upperPanel.setBackground(Color.orange);
        downPanel.setBackground(Color.orange);

        mainPanel.setLayout(new GridLayout(2,1));

        Car cars[] = {
                new Car("Mercedes","AMG GTR", engineType.COMBUSTION, 2022,"Germany",50000, false, condition.USED),
                new Car("BMW","i8",engineType.COMBUSTION,2021,"Germany",40000, false, condition.NEW),
                new Car("Tesla","Y",engineType.ELECTRIC,2024,"USA",35000, false, condition.NEW),
                new Car("Volvo","",engineType.COMBUSTION,2015,"Sweden",20000, false, condition.USED),
                new Car("Toyota","Corolla",engineType.COMBUSTION,2009,"Japan",20000,false,condition.USED),
                new Car("Tesla","X",engineType.ELECTRIC,2022,"USA",32000,false,condition.NEW)
        };

        JPanel infoPanel1 = new JPanel();
        Client clients[] = {
                new Client("Jack","Smith",1998),
                new Client("Łukasz","Arakelyan",2002),
                new Client("Jan","Kowalski",1994)
        };
        JList lista = new JList<>(clients);
        JList lista2 = new JList<>(cars);
        downPanel.add(infoPanel1);
        infoPanel1.setBackground(Color.black);
        infoPanel1.setVisible(false);

        btn1.addActionListener((event)->{
            infoPanel1.add(lista);
            infoPanel1.setVisible(true);
        });

        btn2.addActionListener((event)->{
            System.out.println(Client.clientQueue + " waiting for ");
        });

        btn3.addActionListener((event)->{
            lista.setVisible(false);
            infoPanel1.add(lista2);
            infoPanel1.setVisible(true);
        });

        setVisible(true);
        setResizable(false);
        setSize(750,650);
    }

}