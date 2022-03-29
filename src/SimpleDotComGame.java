import java.util.Scanner;

public class SimpleDotComGame {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int NumOfGuesses = 0; //количество пользователей

        SimpleDotCom DotCom = new SimpleDotCom();

        int rand = (int) (Math.random() * 5); // генераци€ случайного числа
        Arra locations = {rand, rand + 1, rand +2 };

        //DotCom.setLocationCells(locations); // передача местоположени€

        boolean isAlive = true;

        while (isAlive){
            System.out.print("¬ведите число");
            int guess = scanner.nextInt();

            String result = DotCom.checkYourSelf(guess);
            NumOfGuesses++;

            if ( result.equals("ѕотопил")){
                isAlive=false;
                System.out.println("¬ам потребовалось " + NumOfGuesses + " попыток");
            }
        }

    }
}
