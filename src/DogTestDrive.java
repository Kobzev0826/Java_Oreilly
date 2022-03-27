public class DogTestDrive {
    public static void main(String[] args){
        Dog one = new Dog(); // создание объекта класса Dog
        one.size=70;

        Dog two = new Dog();
        two.size = 8;

        Dog three = new Dog();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }
}


class Dog {
    int size;
    String breed;
    String name;

    void bark(){
        if (size > 60) {
            System.out.println("√ав! √ав!");
        }else if (size >14){
            System.out.println("¬уф! ¬уф!");
        }else {
            System.out.println("“€ф! “€ф!");
        }
    }
}
