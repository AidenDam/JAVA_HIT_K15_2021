package bai_4;

public class RunMain
{
    public static void main(String[] args) {
        Sum <Integer> a = new Sum<Integer>(27, 8);
        System.out.println("Tong 2 so: " + (a.getB()+a.getA()));
        Sum <Long> b = new Sum<Long>(27l, 8l);
        System.out.println("Tong 2 so: "+ (b.getA() +b.getB()));
        Sum <Float> c = new Sum<Float>(27.8f, 8.27f);
        System.out.println("Tong 2 so: "+ (c.getB() +c.getA()));
        Sum <Double> d = new Sum<>(27.8, 8.27);
        System.out.println("Tong 2 so: " + (d.getA() +d.getB()));
    }
}
