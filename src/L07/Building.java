package L07;

import java.util.ArrayList;

public class Building {

    private String address;
    private ArrayList<App> apartments;

    public Building(String address, ArrayList<App> apartments) throws Exception {
       setAddress(address);
       setApartments(apartments);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws Exception {
        if (address == null || address.length() < 10)
            throw new Exception("Error address");
        this.address = address;
    }

    public ArrayList<App> getApartments() {


        return apartments;
    }

    public void setApartments(ArrayList<App> apartments) throws Exception {
        if (apartments == null || apartments.size() == 0)
            throw new Exception("Eroor apartments");
        this.apartments = apartments;
    }

    public static void month_report(ArrayList<Building> builds, ArrayList<String> clients) {

        for (int i = 0; i < clients.size(); i++) {
            String name = clients.get(i);
            int sum = 0;
            System.out.println("Nmae "+name);
            for (int j = 0; j < builds.size(); j++) {
                Building building = builds.get(j);
                int countApp = 0;
                ArrayList<App> apps = building.getApartments();
                for (int k = 0; k < apps.size(); k++) {
                    App app = apps.get(k);
                    if (app.getOwner().equals(name)) {
                        countApp++;
                        if(countApp==1) {
                            System.out.println(building.address);
                        }
                        System.out.println(app);
                        System.out.println(app.month_cost());
                        sum += app.month_cost();
                    }
                }
            }
            System.out.println("Total " + sum);
        }

    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", apartments=" + apartments +
                '}';
    }
}
