public class DogTestDrive {
    public static void main(String[] args){
        Dog d = new Dog(); // создание объекта класса Dog
        d.size=40;
        d.bark();
    }
}


class Dog {
    int size;
    String breed;
    String name;

    void bark(){
        System.out.println("Гав! Гав!");
    }
}
