public class DogTestDrive {
    public static void main(String[] args){
       // Dog one = new Dog(); // �������� ������� ������ Dog
       // one.size=70;
        /*
        Dog two = new Dog();
        two.size = 8;


        Dog three = new Dog();
        three.size = 35;

        one.bark(1);
        two.bark(1);
        //three.bark(1);

         */
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("������ ������: " + one.getSize());
        System.out.println("������ ������: " + two.getSize());
        one.bark(1);
        two.bark(1);
    }
}


class Dog {
    int size;
    String breed;
    String name;

    void bark(int numofbarks){
        String woow;
        if (size > 60) {
            //System.out.println("���! ���!");
            woow = "���! ���!";
        }else if (size >14){
            woow = "���! ���!";
            //System.out.println("���! ���!");
        }else {
            woow = "���! ���!";
            //System.out.println("���! ���!");
        }
        while (numofbarks >0){
            System.out.println(woow);
            numofbarks = numofbarks -1;
        }
    }
}


class GoodDog{
    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size = s;
    }

    void bark(int numofbarks){
        String woow;
        if (size > 60) {
            //System.out.println("���! ���!");
            woow = "���! ���!";
        }else if (size >14){
            woow = "���! ���!";
            //System.out.println("���! ���!");
        }else {
            woow = "���! ���!";
            //System.out.println("���! ���!");
        }
        while (numofbarks >0){
            System.out.println(woow);
            numofbarks = numofbarks -1;
        }
    }
}
