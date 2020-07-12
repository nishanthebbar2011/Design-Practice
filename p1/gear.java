package p1;


interface Gear{
  double ratio();
}


class SimpleGear implements Gear{
    private int cog;
    private int chainRing;
    private double ratio;
    private double gearInches;
    Wheel newWheel;


    public double ratio(){
        return (double)getChainRing() / getCog();
    }

    double gearInches(Wheel newWheel){
        return getRatio() * diameter();
    }

    SimpleGear(int cog, int chainRing){
        setCog(cog);
        setChainRing(chainRing);
        setRatio(ratio());
    }

    SimpleGear(int cog, int chainRing, int rim, int tire){
        setCog(cog);
        setChainRing(chainRing);
        newWheel = new Wheel(rim, tire);
        setGearInches(gearInches(newWheel));  
    }


    public double diameter(){
        return newWheel.diameter();
    }

    public int getCog() {
        return cog;
    }

    public void setCog(int cog) {
        this.cog = cog;
    }

    public int getChainRing() {
        return chainRing;
    }

    public void setChainRing(int chainRing) {
        this.chainRing = chainRing;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public double getGearInches() {
        return gearInches;
    }

    public void setGearInches(double gearInches) {
        this.gearInches = gearInches;
    }
}