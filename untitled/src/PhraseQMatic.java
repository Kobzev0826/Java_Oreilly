public class PhraseQMatic {

    public static void main(String[] args){
        //три набора слов для выбора
        String [] worldListOne = {"уполномоченный","взаимный","обоюдный выйгрыш","дотошный","проникающий","вылезающий","отвратительны"};

        String [] worldListTwo  = {"трудный","чистый продукт","фирменный","сетевой","выровненный","ускоренный","общий","сфокусированный","нацеленный на"};

        String [] worldListThree  = {"процесс","пункт разгрузки"," выход из положения","тип структуры","талант",
                "подход","портал","период времени","обзор","образец","пункт следования"};

        //генерация случайных чисел
        int rand1 = (int) (Math.random() * worldListOne.length); // (int) приведение типов
        int rand2 = (int) (Math.random() * worldListTwo.length);
        int rand3 = (int) (Math.random() * worldListThree.length);

        //построение фразы
        String phrase = worldListOne[rand1] + " " + worldListTwo[rand2] + " " + worldListThree[rand3];

        //вывод фразы
        System.out.println(phrase);
    }


}
