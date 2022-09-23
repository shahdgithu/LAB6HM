public class L6HQ1 {
    private double b,r;
    private int y;
    public L6HQ1(double b, double r){
        this. b=b;
        this.r=r;
    }

    public double getB() {
        return b;
    }
    public int getY(){
        return y;
    }
    public void waitforb(double t){
        while (b<t){
            y++;
            double interest=b*r/100;
            b=b+interest;
        }
    }
}
