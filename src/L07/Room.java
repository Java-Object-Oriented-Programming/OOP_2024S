package L07;

public class Room {

    private String kind;
    private int area;
    private int freq;


    public Room(String kind, int area, int freq) throws Exception {
        this.kind = kind;
        setArea(area);
        setFreq(freq);
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) throws Exception {
        if (area <= 0)
            throw new Exception("Error area");
        this.area = area;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) throws Exception {
        if (freq < 0 || freq > 31)
            throw new Exception("Error freq");
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Room{" +
                "kind='" + kind + '\'' +
                ", area=" + area +
                ", freq=" + freq +
                '}';
    }
}
