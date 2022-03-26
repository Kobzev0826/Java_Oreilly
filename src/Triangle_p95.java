public class Triangle_p95 {
    double area;
    int height;
    int lenght;

    public static void main (String [] args){
        Triangle_p95 [] ta = new Triangle_p95[4];
        int x = 0;

        while(x<4){
            ta[x] = new Triangle_p95();
            ta[x].height = (x+1)*2;
            ta[x].lenght = x +4;
            ta[x].setArea();
            System.out.print("треугольник" +x+ ", зона");
            System.out.println("=" + ta[x].area);
            x = x+1;
        }
        int y=x;
        x = 27;
        Triangle_p95 t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y= " + y);
        System.out.println(", zone t5 = " + t5.area);

    }
    void setArea(){
        area = (height * lenght)/2;
    }
}



