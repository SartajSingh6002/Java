import java.util.Random;

public class biased_check {
    public static void main() {
        int i = 0;
        int a1=0;
        int a2=0;
        int a3=0;
        int a4=0;
        int a5=0;
        int a6=0;
        while (i <= 1000) {
            Random rand = new Random();
            int a = rand.nextInt(1, 7);
            if (a == 1){
                a1++;
            }
            else if (a == 2) {
                a2++;
            }
            else if (a == 3) {
                a3++;
            }
            else if (a == 4) {
                a4++;
            }
            else if (a == 5) {
                a5++;
            }
            else if (a == 6) {
                a6++;
            }
            i++;
        }
        System.out.println("1:" +a1);
        System.out.println("2:" +a2);
        System.out.println("3:"+ a3);
        System.out.println("4:"+ a4);
        System.out.println("5:"+ a5);
        System.out.println("6:"+ a6);
    }
}
