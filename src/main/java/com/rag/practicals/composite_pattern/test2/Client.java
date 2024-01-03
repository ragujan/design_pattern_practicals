package com.rag.practicals.composite_pattern.test2;

public class Client {
    public static void main(String[] args) {
        Component hdd  = new Leaf("hdd",400.00);
        Component keyboard  = new Leaf("keyboard",600.00);
        Component mouse  = new Leaf("mouse",500.00);
        Component ram  = new Leaf("ram",200.00);
        Component processor = new Leaf("processor",1000.00);


        Composite computer = new Composite("computer");

        Composite motherboard = new Composite("motherboard");
        motherboard.add(ram);
        motherboard.add(processor);

        Composite cabinet = new Composite("cabinet");
        cabinet.add(hdd);
        cabinet.add(motherboard);

        Composite peripherals = new Composite("peripherals");
        peripherals.add(mouse);
        peripherals.add(keyboard);


        computer.add(cabinet);
        computer.add(peripherals);

        computer.showPrice();




    }
}
