import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){locationCells = loc;}

    public void setName(String name){name = name;}

    public String getName(){return name;}

    public String checkYourSelf(String userInput){
        //�������� ���������� �� ��������� ������������� ������ ������ ArrayList, ���������� ������
        int index = locationCells.indexOf(userInput);
        String result = "����";
        //System.out.println(index);
        if (index >= 0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result = "�������";
                System.out.println("�� ������� ��������" + name );
            }else{
                result = "�����";
            }
        }


        //System.out.println(result);
        return result;
    }
}
