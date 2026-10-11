import java.util.Random;

public class dice_playervspc {
    public static void main(String[] args) {
        Random rand = new Random();

        // Player rolls two dice
        int v1 = rand.nextInt(1, 7);
        int v2 = rand.nextInt(1, 7);
        int player = v1 + v2;

        System.out.println("Player: " + v1 + " and " + v2 + ", total = " + player);

        // Computer rolls two dice
        int V1 = rand.nextInt(1, 7);
        int V2 = rand.nextInt(1, 7);
        int pc = V1 + V2;

        System.out.println("Computer: " + V1 + " and " + V2 + ", total = " + pc);

        // Compare the totals
        if (player > pc) {
            System.out.println("Player wins!");}
        else if (pc > player) {
            System.out.println("Computer wins!");}
        else {
            System.out.println("It's a tie!");}
    }
}
