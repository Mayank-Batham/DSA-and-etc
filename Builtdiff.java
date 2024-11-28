public class Builtdiff {
    static void MINMAX(float A, float B){
        System.out.println(Math.round((A-B-0.1+0.001)*1000)+" "+Math.round((A-B+0.1-0.001)*1000));
        return;
    }
    public static void main(String[] args) {
        float B = 95.1f;
        float A = 96.0f;
        MINMAX(A, B);
    }
}