public class L6HQ1Test {
    public static void main(String[] args) {
        L6HQ1 sh=new L6HQ1(1000,10);
        sh.waitforb(1000000);
        System.out.println("your balance is in the million"+sh.getY());
    }
}
