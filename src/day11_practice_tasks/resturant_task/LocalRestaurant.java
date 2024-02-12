package day11_practice_tasks.resturant_task;

public class LocalRestaurant {
    public static void main(String[] args) {

        Server server1 = new Server("Michael Owen", 5, 25.9, true);

        Server[] servers = {
                new Server("Michael", 1, 30.5, true),
                new Server("Daniela", 2, 20.5, false)
        };

        Chef[] chefs = {
                new Chef("Joan", 3, 30.5, true),
                new Chef("Daniela", 4, 20.5, false)
        };

        Restaurant restaurant = new Restaurant("Chiyavan", "San Diego", 5);

        restaurant.hireServers(servers);
        restaurant.hireChefs(chefs);

        restaurant.hireServer(server1);

        System.out.println(restaurant);

    }
}

// How do I call one of the methods from Chef or Server such as washDishes()