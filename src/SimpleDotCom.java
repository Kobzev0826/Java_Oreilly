import java.util.ArrayList;

public class SimpleDotCom {
    //private int [] locationCells;
    private ArrayList<String> locationCells;
    int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public String checkYourSelf(int userInput){
        //�������� ���������� �� ��������� ������������� ������ ������ ArrayList, ���������� ������
        int index = locationCells.indexOf(userInput);
        String result = "����";

            if (index >= 0){
                locationCells.remove(index);

                if (locationCells.isEmpty()){
                    result = "�������";
                }else{
                    result = "�����";
                }
            }


        //System.out.println(result);
        return result;
    }

}
