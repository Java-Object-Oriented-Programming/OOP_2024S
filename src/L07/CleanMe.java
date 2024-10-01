package L07;

import L04.A;

import java.util.ArrayList;
import java.util.Random;

public class CleanMe {

    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<String> clients = new ArrayList<>() {
            {
                for (int i = 0; i < 10; i++) {
                    add("name-"+i);
                }
            }
        };
        ArrayList<Building> buildings = new ArrayList<>() {{

            for (int i = 0; i < 3; i++) {
                ArrayList<App> apps = new ArrayList<>() {{
                    for (int j = 0; j < 10; j++) {
                        ArrayList<Room> rooms = new ArrayList<>() {{
                            for (int k = 0; k < 3; k++) {
                                try {
                                    add(new Room("" + k, rd.nextInt(-5, 60), rd.nextInt(-9, 31)));
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    k--;
                                }
                            }
                        }};
                        try {
                            add(new App(j, clients.get(rd.nextInt(0, 10)), rooms, rd.nextInt(15, 50)));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            j--;
                        }
                    }
                }};
                try {

                    add(new Building("building-" + i, apps));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }};
        for(Building building : buildings){
            System.out.println(building);
        }

        Building.month_report(buildings,clients);
    }
}
