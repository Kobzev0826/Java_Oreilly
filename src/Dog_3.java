public class Dog_3 {
    String name;
    public static void main(String[] args) {
        //�������� ������� Dog � ��������� � ���� �������
        Dog_3 dog1 = new Dog_3();
        dog1.bark();
        dog1.name = "����";

        // �������� ������� DOG
        Dog_3[] myDogs = new Dog_3[3];
        myDogs[0] = new Dog_3();
        myDogs[1] = new Dog_3();
        myDogs[2] = dog1;

        //� ������� ������ �� ������ �������� ������ � �������� DOG
        myDogs[0].name = "����";
        myDogs[1].name = "������";

        System.out.print("��� ��������� ������ - ");
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
