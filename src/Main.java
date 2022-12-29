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
        int middleNameFind = fullName.indexOf('I', firstNameFind+1);
        int middleNameFind2 = fullName.indexOf(' ', firstNameFind2+1);
        String middleName = fullName.substring(middleNameFind, middleNameFind2);
        int lastNameFind = fullName.indexOf('I', middleNameFind+1);
        String lastName = fullName.substring(lastNameFind, fullName.length()-1);
        System.out.println(firstName+" "+middleName+" "+(lastName+fullName.charAt(fullName.length()-1)));
        System.out.println("Фамилия сотрудника - "+firstName);
        System.out.println("Имя сотрудника - "+middleName);
        System.out.println("Отчество сотрудника - "+(lastName+fullName.charAt(fullName.length()-1)));
    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "ivanov ivan ivanovich";
        String[] splitFullName = fullName.split(" ");
        for (int i = 0; i < splitFullName.length; i++) {
            char j = splitFullName[i].charAt(0);
            //char[] letter = splitFullName[i].toCharArray();
            splitFullName[i] = splitFullName[i].toUpperCase();
        }
    }
