import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String fullName = "Ivanov Ivan Ivanovich";
        int firstNameFind = fullName.indexOf('I');
        int firstNameFind2 = fullName.indexOf(' ');
        String firstName = fullName.substring(firstNameFind, firstNameFind2);
        int middleNameFind = fullName.indexOf('I', firstNameFind + 1);
        int middleNameFind2 = fullName.indexOf(' ', firstNameFind2 + 1);
        String middleName = fullName.substring(middleNameFind, middleNameFind2);
        String lastName = fullName.substring(middleNameFind2+1);
        System.out.println(firstName + " " + middleName + " " + lastName);
        System.out.println("Фамилия сотрудника - " + firstName);
        System.out.println("Имя сотрудника - " + middleName);
        System.out.println("Отчество сотрудника - " + lastName);
        System.out.println("Второй вариант решения задачи");
        int[] index = new int[3];
        for (int i = 0, start = 0; i < index.length; i++, start++) {
            index[i] = fullName.indexOf('I', start);
            start = index[i];
        }
        int[] index2 = new int[2];
        for (int i = 0, start = 0; i < index2.length; i++, start++) {
            index2[i] = fullName.indexOf(' ', start);
            start = index2[i];
        }
        System.out.println("Фамилия сотрудника - " + fullName.substring(index[0], index2[0]));
        System.out.println("Имя сотрудника - " + fullName.substring(index[1], index2[1]));
        System.out.println("Отчество сотрудника - " + fullName.substring(index[2]));
        System.out.println();
    }

    public static String firstLetterToUpperCase(String word) {
        String i = word.substring(0,1);
        String r = i.toUpperCase() + word.substring(1);
        return r;
    }


    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "ivanov ivan ivanovich";
        String[] splitFullName = fullName.split(" ");
        System.out.println(firstLetterToUpperCase(splitFullName[0])+" "+firstLetterToUpperCase(splitFullName[1])+" "+firstLetterToUpperCase(splitFullName[2]));
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        String firstString = "135";
        String secondString = "246";
        String[] numbers1 = firstString.split("");
        String[] numbers2 = secondString.split("");
        String finalString = "";
        for (int i = 0; i < numbers1.length; i++) {
            String lastString = numbers1[i] + numbers2[i];
            finalString = finalString + lastString;
        }
            System.out.println(finalString);
    }
}
