import java.util.ArrayList;

public class DotComBust {

    private  GameHelper helper = new GameHelper();
    private ArrayList <DotCom> dotComArrayList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void  SetUpGame(){
        // ������� ���� �� �������� ������
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("Pets.com");
        DotCom three = new DotCom();
        three.setName("Pets.com");

        dotComArrayList.add(one);
        dotComArrayList.add(two);
        dotComArrayList.add(three);

        System.out.println("���� ���� -  �������� 3 �����:" + one.getName()+" " + two.getName() + " " + three.getName());
        System.out.println("������������ ������� ��� ��� ����� �������!");

        for (DotCom dotComSet : dotComArrayList){
            ArrayList<String> newLoc = helper.placeDotCom(3);
            dotComSet.setLocationCells(newLoc);
        }
    }


    private void checkUserGuess(String userGuess){
        numOfGuesses ++ ;               //���������� ������� ������������
        String result = "����";

        for (DotCom dotComTest : dotComArrayList){
            result = dotComTest.checkYourSelf(userGuess); // �������� ���� ������������ � ������ DotCom

            if (result.equals("�����")){
                break;
            }
            if ( result.equals("�������")){
                dotComArrayList.remove(dotComTest);
                break;
            }
        }
        System.out.println(result);
    }


    private void    startPlaying(){

        while(!dotComArrayList.isEmpty()){      //���� �� ������ ������
            String userGuess = helper.getUserInput("������ ���"); // user input
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void finishGame(){
        System.out.println("��� ����� ����������! ���� ����� ����� ���������!");

        if ( numOfGuesses <=18){
            System.out.println("��� ������ � ��� ����� " + numOfGuesses + " �������");
            System.out.println("�� ������ ������ ���� ����������!");
        }else {
            System.out.println("�� ��������� ������� ����� �������, ��� ������ " + numOfGuesses + "�������");
            System.out.println("���� ����� ������� ������ ����� ��������!");
        }
    }


    public static void main(String[] args){
        DotComBust game = new DotComBust();
        game.SetUpGame(); // ���������� ����
        game.startPlaying(); // ������ ����
    }
}
