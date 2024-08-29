package L03;

public class ssd {

    private int size = 512;
    private int speed = 3;
    private int ac =0;
    private String[] buf = new String[512];

    public String read(int index){
        this.ac++;
        return buf[index];
    }

}
