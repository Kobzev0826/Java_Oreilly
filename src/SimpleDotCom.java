import java.util.ArrayList;

public class SimpleDotCom {
    //private int [] locationCells;
    private ArrayList<String> locationCells;
    int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public String checkYourSelf(int userInput){
        //проверка содержится ли указанная пользователем ячейка внутри ArrayList, запрашивая индекс
        int index = locationCells.indexOf(userInput);
        String result = "Мимо";

            if (index >= 0){
                locationCells.remove(index);

                if (locationCells.isEmpty()){
                    result = "Потопил";
                }else{
                    result = "Попал";
                }
            }


        //System.out.println(result);
        return result;
    }

}
