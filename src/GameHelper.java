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
        String [] alphacoords = new String [comSize];   // ’ранить координаты типа f6
        String temp = null;                             // ¬ременна€ строка дл€ хранени€ конкатенации
        int [] coords = new int [comSize];              // координаты "сайта"
        int attempts = 0;                               // счетчик попыток
        boolean success = false;                        // подход€щее положение
        int location = 0;                               // текущее начальное местоположение

        comCount ++;                                    // счетчик сайта дл€ размещени€
        int incr = 1;                                   // горизонтальный инкремент

        if ( (comCount %2) == 1){ incr = gridLen;}      // нечетный устанавливаем вертикально

        while ( !success && attempts <200){             // main search
            location = (int)(Math.random() * gridSize); // random start point
            int x = 0;                                  //позици€ на сайте которую размещаем
            success = true;                             //

            while (success && x < comSize){             // поиск соседней неиспользованной €чейки
                if ( grid[location] == 0){              // если не используетс€
                    coords[x++] = location;             // сохранение местоположени€
                    location +=incr;                    // пробуем соседнюю €чейку

                    if (location >= gridSize){          // низ ( выход за рамки)
                        success = false;                // неудача
                    }
                    if (x>0 && (location % gridLen == 0)){  // правый край ( выход за рамки)
                        success = false;                // неудача
                    }
                }else{                              // уже используемое местоположение
                    success = false;                // неудача
                }
            }
        }
        // перевод положени€ в символьные координаты
        int x =0;
        int row = 0;
        int column = 0;

        while(x < comSize){
            grid[coords[x]] = 1;                        // отметка на главное сетке "исспользованное"
            row = (int) (coords[x] / gridLen);          //значение строки
            column = coords [x] % gridLen;              //значение столбца
            temp = String.valueOf(alphabet.charAt(column));

            alphabetCells.add(temp.concat(Integer.toString(row)));
            x++;
        }


        return alphabetCells;
    }

}
