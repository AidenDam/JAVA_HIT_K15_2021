package bai_4;

public class Sum <N>
{
    N A;
    N B;

    public Sum() {
    }

    public Sum(N A, N B) {
        this.A = A;
        this.B = B;
    }

    public N getA() {
        return A;
    }

    public void setA(N A) {
        this.A = A;
    }

    public N getB() {
        return B;
    }

    public void setB(N B) {
        this.B = B;
    }
}
