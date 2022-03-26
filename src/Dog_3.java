public class Dog_3 {
    String name;
    public static void main(String[] args) {
        //создание объекта Dog и получение к нему доступа
        Dog_3 dog1 = new Dog_3();
        dog1.bark();
        dog1.name = "Барт";

        // создание МАССИВА DOG
        Dog_3[] myDogs = new Dog_3[3];
        myDogs[0] = new Dog_3();
        myDogs[1] = new Dog_3();
        myDogs[2] = dog1;

        //с помощью ссылок на массив получаем доступ к объектам DOG
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";

        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[myDogs.length - 1].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " say: -Woow!");
    }

    public void eat() {
    }

    public void chaseCat() {
    }

}
