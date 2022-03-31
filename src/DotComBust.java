import java.util.ArrayList;

public class DotComBust {

    private  GameHelper helper = new GameHelper();
    private ArrayList <DotCom> dotComArrayList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void  SetUpGame(){
        // костыль ИМХО по созданию сайтов
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("Pets.com");
        DotCom three = new DotCom();
        three.setName("Pets.com");

        dotComArrayList.add(one);
        dotComArrayList.add(two);
        dotComArrayList.add(three);

        System.out.println("Ваша цель -  обрушить 3 сайта:" + one.getName()+" " + two.getName() + " " + three.getName());
        System.out.println("Постарайтесь сделать это как можно быстрее!");

        for (DotCom dotComSet : dotComArrayList){
            ArrayList<String> newLoc = helper.placeDotCom(3);
            dotComSet.setLocationCells(newLoc);
        }
    }


    private void checkUserGuess(String userGuess){
        numOfGuesses ++ ;               //количество попыток пользователя
        String result = "Мимо";

        for (DotCom dotComTest : dotComArrayList){
            result = dotComTest.checkYourSelf(userGuess); // проверка хода пользователя у метода DotCom

            if (result.equals("Попал")){
                break;
            }
            if ( result.equals("Потопил")){
                dotComArrayList.remove(dotComTest);
                break;
            }
        }
        System.out.println(result);
    }


    private void    startPlaying(){

        while(!dotComArrayList.isEmpty()){      //пока не станет пустым
            String userGuess = helper.getUserInput("Сделай ход"); // user input
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void finishGame(){
        System.out.println("Все сайты уничтожены! Ваши акции стали фантиками!");

        if ( numOfGuesses <=18){
            System.out.println("Это заняло у Вас всего " + numOfGuesses + " попыток");
            System.out.println("Вы успели спасти свои инвестиции!");
        }else {
            System.out.println("Вы потратили слишком много времени, это заняло " + numOfGuesses + "попыток");
            System.out.println("Рыбы водят хоровот вокруг Ваших вложений!");
        }
    }


    public static void main(String[] args){
        DotComBust game = new DotComBust();
        game.SetUpGame(); // подготовка игры
        game.startPlaying(); // начало игры
    }
}
