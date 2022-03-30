import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDotComGame {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int NumOfGuesses = 0; //���������� �������������

        SimpleDotCom DotCom = new SimpleDotCom();

        int rand = (int) (Math.random() * 5); // ��������� ���������� �����
        ArrayList<String> locations = new ArrayList<String>();
        for ( int i=0;i<3;i++){locations.add(String.valueOf(rand+i));}
        //int [] locations = {rand, rand + 1, rand +2 };

        DotCom.setLocationCells(locations); // �������� ��������������

        boolean isAlive = true;

        while (isAlive){
            System.out.print("������� �����");
            String guess = scanner.nextLine();

            String result = DotCom.checkYourSelf(guess);
            NumOfGuesses++;

            if ( result.equals("�������")){
                isAlive=false;
                System.out.println("��� ������������� " + NumOfGuesses + " �������");
            }
        }

    }
}
