package day11_practice_tasks.resturant_task;

import java.util.ArrayList;

public class Restaurant {

    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs = new ArrayList<>();


    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServers(Server[] servers) {
        for (Server server : servers) {
            hireServer(server);
        }
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireChefs(Chef[] chefs) {
        for (Chef chef : chefs) {
            hireChef(chef);
        }
    }

    public void terminateChef(int employeeID) {
        chefs.removeIf(p -> p.employeeID == employeeID);
    }

    public void terminateServer(int employeeID) {
        servers.removeIf(p -> p.employeeID == employeeID);
    }

    @Override
    public String  toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers +
                ", chefs=" + chefs +
                '}';
    }
}