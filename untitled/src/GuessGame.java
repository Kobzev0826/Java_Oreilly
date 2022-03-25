public class GuessGame {
    player p1;
    player p2;
    player p3;

    public void startGame(){
        //создание 3х объектов player и присваивание их трем переменным экзмепляра
        p1=new player();
        p2=new player();
        p3=new player();
        //перменные для сохранения вариантов для каждого из игроков
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        //объявление переменных для хранения правильных/неправильных ответов
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10); //число, которое игроуи будут угадывать
        System.out.println("Я загадываю число от 0 до 9...");

        while (true){
            System.out.println("Число, которое нужно угадать, - " + targetNumber);
            //вызов методов guess для каждого объекта
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думат, что это " + guessp1);

            guessp2 = p2.number;
            System.out.println("второй игрок думат, что это " + guessp2);

            guessp3 = p3.number;
            System.out.println("Третий игрок думат, что это " + guessp3);

            if (guessp1 == targetNumber){p1isRight=true;}
            if (guessp2 == targetNumber){p2isRight=true;}
            if (guessp3 == targetNumber){p3isRight=true;}

            if ( p1isRight || p2isRight || p3isRight){
                System.out.println("У нас есть победитель");
                System.out.println("Первый игрок угадал? " + p1isRight);
                System.out.println("Второй игрок угадал? " + p2isRight);
                System.out.println("Третий игрок угадал? " + p3isRight);
                System.out.println("Конец игры");
                break;
            }else{
                System.out.println("Игроки должны попрбовать еще раз.");
            }

        }


    }

}


class player{
    int number = 0;
    public void guess(){
        number = (int)(Math.random() * 10);
        System.out.println("Думаю, это число" + number);
    }
}


class GameLauncher{
    public static void main(String[] args){
        GuessGame game = new GuessGame();
        game.startGame();
    }
}