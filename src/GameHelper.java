import java.io.*;
import java.util.*;

public class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLen = 7;
    private int gridSize = 49;
    private int comCount = 0;
    private int [] grid = new int [gridSize];

    public String getUserInput(String promt){
        String InLine = null;
        System.out.print(promt + " ");
        try{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            InLine = bf.readLine();
            if ( InLine.length() == 0) return null;
        }catch(IOException e){
            System.out.println("IOException: " + e);
        }

        return InLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize){

        ArrayList<String> alphabetCells = new ArrayList<String>();
        String [] alphacoords = new String [comSize];   // ������� ���������� ���� f6
        String temp = null;                             // ��������� ������ ��� �������� ������������
        int [] coords = new int [comSize];              // ���������� "�����"
        int attempts = 0;                               // ������� �������
        boolean success = false;                        // ���������� ���������
        int location = 0;                               // ������� ��������� ��������������

        comCount ++;                                    // ������� ����� ��� ����������
        int incr = 1;                                   // �������������� ���������

        if ( (comCount %2) == 1){ incr = gridLen;}      // �������� ������������� �����������

        while ( !success && attempts <200){             // main search
            location = (int)(Math.random() * gridSize); // random start point
            int x = 0;                                  //������� �� ����� ������� ���������
            success = true;                             //

            while (success && x < comSize){             // ����� �������� ���������������� ������
                if ( grid[location] == 0){              // ���� �� ������������
                    coords[x++] = location;             // ���������� ��������������
                    location +=incr;                    // ������� �������� ������

                    if (location >= gridSize){          // ��� ( ����� �� �����)
                        success = false;                // �������
                    }
                    if (x>0 && (location % gridLen == 0)){  // ������ ���� ( ����� �� �����)
                        success = false;                // �������
                    }
                }else{                              // ��� ������������ ��������������
                    success = false;                // �������
                }
            }
        }
        // ������� ��������� � ���������� ����������
        int x =0;
        int row = 0;
        int column = 0;

        while(x < comSize){
            grid[coords[x]] = 1;                        // ������� �� ������� ����� "���������������"
            row = (int) (coords[x] / gridLen);          //�������� ������
            column = coords [x] % gridLen;              //�������� �������
            temp = String.valueOf(alphabet.charAt(column));

            alphabetCells.add(temp.concat(Integer.toString(row)));
            x++;
        }


        return alphabetCells;
    }

}
