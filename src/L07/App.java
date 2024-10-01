package L07;

import java.util.ArrayList;

public class App {

    private int app_num;
    private String owner;
    private ArrayList<Room> rooms;
    private int rate;


    public App(int app_num, String owner, ArrayList<Room> rooms, int rate) throws Exception {
       setApp_num(app_num);
       setOwner(owner);
       setRooms(rooms);
       setRate(rate);
    }

   public int month_cost(){
        int sum=0;
       for (int i = 0; i < rooms.size(); i++) {
           Room room = rooms.get(i);
           sum+=room.getArea()*room.getFreq()*rate;
       }
        return sum;
   }


    public int getApp_num() {
        return app_num;
    }

    public void setApp_num(int app_num) throws Exception {
        if (app_num < 0)
            throw new Exception("Error set_num");
        this.app_num = app_num;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) throws Exception {
        if (owner == null || owner.length() < 1)
            throw new Exception("Error Owner");
        this.owner = owner;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms ) throws Exception{
        if(rooms== null || rooms.size()==0)
            throw new Exception("Error rooms");
        this.rooms = rooms;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) throws Exception{
        if(rate<20)
            throw new Exception("Error rate");
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "App{" +
                "app_num=" + app_num +
                ", owner='" + owner + '\'' +
                ", rooms=" + rooms +
                ", rate=" + rate +
                '}';
    }
}
