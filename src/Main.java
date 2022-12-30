import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
        int lastNameFind = fullName.indexOf('I', middleNameFind + 1);
        String lastName = fullName.substring(lastNameFind, fullName.length() - 1);
        System.out.println(firstName + " " + middleName + " " + (lastName + fullName.charAt(fullName.length() - 1)));
        System.out.println("Фамилия сотрудника - " + firstName);
        System.out.println("Имя сотрудника - " + middleName);
        System.out.println("Отчество сотрудника - " + (lastName + fullName.charAt(fullName.length() - 1)));
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
        System.out.println("Отчество сотрудника - " + fullName.substring(index[2], fullName.length() - 1) + fullName.charAt(fullName.length() - 1));
    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "ivanov ivan ivanovich";
        String[] splitFullName = fullName.split(" ");
        for (int i = 0; i < splitFullName.length; i++) {
            char[] letter = splitFullName[i].toCharArray();
            char firstLetter = Character.toUpperCase(letter[0]);
            letter[0] = firstLetter;
            for (int j = 0; j < letter.length; j++) {
                System.out.print(letter[j]);

            }
            //splitFullName[i] = splitFullName[i].replace(splitFullName[i].charAt(0), firstLetter);

        }
        System.out.println();
        System.out.println(Arrays.toString(splitFullName));
    }
}
