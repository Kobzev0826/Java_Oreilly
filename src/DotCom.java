import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){locationCells = loc;}

    public void setName(String name){name = name;}

    public String getName(){return name;}

    public String checkYourSelf(String userInput){
        //проверка содержится ли указанная пользователем ячейка внутри ArrayList, запрашивая индекс
        int index = locationCells.indexOf(userInput);
        String result = "Мимо";
        //System.out.println(index);
        if (index >= 0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result = "Потопил";
                System.out.println("Вы успешно потопили" + name );
            }else{
                result = "Попал";
            }
        }


        //System.out.println(result);
        return result;
    }
}
