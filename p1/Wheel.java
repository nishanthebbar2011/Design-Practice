package p1;

import java.util.ArrayList;
import java.util.List;

class Wheel {
    private int rim;
    private int tire;
    
    

    public Wheel(int rim, int tire){
        setRim(rim);
        setTire(tire);
    }

    public List<Wheel> Wheelify(int[][] data){
        List<Wheel> resultWheels = new ArrayList<>();
        for(int i = 0; i < data.length; i++)
                resultWheels.add(new Wheel(data[i][0], data[i][1]));
        return resultWheels;
    }
    
    public double circumference(){
        return Math.PI * diameter();
    }

    public int diameter(){
        return getRim() + (2 * getTire());
    }
    
    public int getRim() {
        return rim;
    }

    public void setRim(int rim) {
        this.rim = rim;
    }

    public int getTire() {
        return tire;
    }

    public void setTire(int tire) {
        this.tire = tire;
    }
}