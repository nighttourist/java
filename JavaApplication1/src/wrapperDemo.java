
public class wrapperDemo {
    public static void main(String[] args) {
        int x=30;
        Integer y= Integer.valueOf(x);
        System.out.println("y= "+y);
        Integer z=x;
        System.out.println("y= "+y);
        //object>primitive 
        Double d=new Double(10.25);
        System.out.println("d= "+d);
        double e= d.doubleValue();
        System.out.println("e ="+e);
    }
}
