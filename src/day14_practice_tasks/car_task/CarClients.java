package day14_practice_tasks.car_task;

public class CarClients {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Tundra", 2017, 17_000, "Black");
        Honda honda = new Honda("Accord", 2019, 18_000, "Blue");
        BMW bmw = new BMW( "i8", 2021, 21_000, "Silver");
        Audi audi = new Audi("Q3", 2015, 19_000, "Black");
        Mercedes mercedes = new Mercedes("EQB SUV", 2019, 18_000, "Red");
        Tesla tesla = new Tesla("Model 3", 2017, 40_000, "Black");
        Nio nio = new Nio("ES8", 2017, 18_500, "Green");
        CydeoCar cydeoCar = new CydeoCar("Java", 2017, 17_000, "Black");

        analyze(toyota);
        analyze(honda);
        analyze(bmw);
        analyze(audi);
        analyze(mercedes);
        analyze(tesla);
        analyze(nio);
        analyze(cydeoCar);

    }

    private static void analyze(Car car) {

        System.out.println(car);

        car.start();
        car.drive();

        if (car instanceof AutoPark) {
            ((AutoPark) car).autoPark();
        }
        if (car instanceof AutoPilot) {
            ((AutoPilot) car).selfDrive();
        }
        if (car instanceof Flyable) {
            ((Flyable) car).fly();
        }

        car.stop();
        System.out.println();

    }


}

/*
11. Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */