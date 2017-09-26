import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите город проживания: ");
        String city = in.nextLine();
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        System.out.println("Введите хобби: ");
        in.nextLine();
        String hobby = in.nextLine();
        System.out.println("\nИмя: " + name  + "\nГород: " + city + "\nВозраст: " + age + "\nХобби: " + hobby);
        System.out.println("Человек по имени " + name + " живет в городе " + city + ".\n" + "Этому человеку " + age + " лет и любит он заниматься " + hobby + ".");
        System.out.println(name + " - имя " + "\n" + city + " - город " +"\n"+ + age + " - возраст " + "\n" + hobby + " - хобби ");
    }
}