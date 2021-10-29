import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String symbolSpace = " ";
        String fullName = lastName + symbolSpace + firstName + symbolSpace + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        // Задание 2
        System.out.println("Задание 2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);
        // Задание 3
        System.out.println("Задание 3");
        // first variant
        String fullNameForDepartment = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNameForDepartment);
        // second variant
        String symbolSeparate = ";";
        String[] words = fullName.split(symbolSpace);
        fullNameForDepartment = words[0] + symbolSeparate + words[1] + symbolSeparate + words[2];
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNameForDepartment);
        // Задание 4
        System.out.println("Задание 4");
        String fullNameTaskFour = "Иванов СемЁн Семёнович";
        if ((fullNameTaskFour.contains("Ё") || fullNameTaskFour.contains("ё"))) {
            fullNameTaskFour = fullNameTaskFour.replace('Ё', 'Е');
            fullNameTaskFour = fullNameTaskFour.replace('ё', 'е');
        }
        System.out.println("Данные ФИО сотрудника — " + fullNameTaskFour);
        // Задание 5
        System.out.println("Задание 5");
        String fullNameTaskFive = "Ivanov Ivan Ivanovich";
        int beginIndex = 0;
        int indexFirstSpace = fullNameTaskFive.indexOf(symbolSpace, 0);
        int indexLastSpace = fullNameTaskFive.lastIndexOf(symbolSpace);
        lastName = fullNameTaskFive.substring(beginIndex, indexFirstSpace);
        firstName = fullNameTaskFive.substring(indexFirstSpace + 1, indexLastSpace);
        //DisterRU в случае, когда взять до конца длины, второй аргумент излишний
        middleName = fullNameTaskFive.substring(indexLastSpace + 1 );

        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
        // Задание 6
        System.out.println("Задание 6");
        String fullNameTaskSix = "ivanov ivan ivanovich";
        words = fullNameTaskSix.split(symbolSpace);
        // самостоятельный вариант
        // разбить на отдельные слова, каждое слово перевести в StringBuilder, изменить первый символ
        //for (int i = 0; i < words.length; ++i) {
        //    StringBuilder sbPartName = new StringBuilder(words[i]);
        //    char symbolToUpperCase = sbPartName.charAt(0);
        //    sbPartName.setCharAt(0, Character.toUpperCase(symbolToUpperCase));
        //    words[i] = sbPartName.toString();
        //}
        // from DisterRU
        // Можно вместо StringBuilder использовать массив чаров через char[] arr = words[i].toCharArray(),
        // в нем менять символ, а потом words[i] = new String(arr);
        for (int i = 0; i < words.length; ++i) {
             char[] arrItem = words[i].toCharArray();
            arrItem[0] = Character.toUpperCase(arrItem[0]);
             words[i] = new String(arrItem);
        }
        String fullNameTaskSixTrue = words[0] + symbolSpace + words[1] + symbolSpace + words[2];
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullNameTaskSixTrue);
        // переписать в массив, работать с элементами массива, вернуть в строку
        char [] nameToCharArray = fullNameTaskSix.toCharArray();
        nameToCharArray[0] = Character.toUpperCase(nameToCharArray[0]);
        for (int i = 1; i < nameToCharArray.length-1; ++i) {
            if (Character.isWhitespace(nameToCharArray[i])) {
                nameToCharArray[i + 1] = Character.toUpperCase(nameToCharArray[i + 1]);
            }
        }
        fullNameTaskSixTrue = new String(nameToCharArray);
        System.out.println("Верное написание Ф. И. О. сотрудника c заглавных букв — " + fullNameTaskSixTrue);

        // Задание 7
        System.out.println("Задание 7");
        String firstString = "135";
        String secondString = "246";
        StringBuilder sbResult = new StringBuilder();
        for (int i = 0; i < firstString.length(); ++i) {
            sbResult.append(firstString.charAt(i));
            sbResult.append(secondString.charAt(i));
        }
        String stringResult = sbResult.toString();
        System.out.println(stringResult);
        // Задание 8
        System.out.println("Задание 8");
        String someLetters = "aaaabccddefgghiijjkk";
        char arraySomeLetters[] = someLetters.toCharArray();
        char doubleLetter = ' ';
        for (int i = 0; i < arraySomeLetters.length-1; ++i) {
             if (doubleLetter == arraySomeLetters[i]){
                 continue;
             };
             if(arraySomeLetters[i] == arraySomeLetters[i+1]){
                 doubleLetter = arraySomeLetters[i];
                 System.out.print(doubleLetter );
             }
        }
    }
}

