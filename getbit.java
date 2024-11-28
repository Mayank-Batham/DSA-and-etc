public class getbit {
    public static void main(String[] args) {
        int pos = 1;
        int n = 5;
        if ((1<<pos & n)==0){
            System.out.println("0");
        }else{
        System.out.println("1");
        }
        System.out.println(~(1<<pos)&n);     
    }
}