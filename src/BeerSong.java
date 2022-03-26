
public class BeerSong {
    
    public static void main (String[] args){

        int beerNum = 99;
        String word ="battles (battles)";

        while (beerNum > 0){
            if (beerNum == 1){
                word = "бутылка"; // ??? ?????????? ?????? - ???? ???????
            }
            System.out.println(beerNum + " " + word + "beers on wall");
            System.out.println(beerNum + " " + word + "beer");
            System.out.println("Take one");
            System.out.println("let it go in a circle");
            System.out.println("--------------------");
            beerNum = beerNum - 1;

            if (beerNum > 0){
                System.out.println(beerNum + " " + word + "beers on wall");
            }else {
                System.out.println("No beers on wall");
            }
        }

    }

}
