import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("1 задание");
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        if (age>=18) System.out.println("Поздравляю с совершеннолетием");
        else System.out.println("нужно немного подождать");
        System.out.println("2 задание");

        if (age>=7&&age<=18) System.out.println("ребенок ходит в школу");
        else if (age>=18&&age<=24) System.out.println("Человек уже закончил школу и может отправляться в университет");
        else if (age>=24) System.out.println("человек окончил университет и ему пора искать первую работу");

        System.out.println("3 задание");
        int van=102;
        int people =60;
        if (people<=60)System.out.println("Есть сидячие места");
        else System.out.println("Есть стоячие места");
        System.out.println("Домашнее задание - 3");
        System.out.println("Домашнее задание - 1");
System.out.println("Если возраст человека равен "+age+", то ");
        if (age>=2 && age<=6) System.out.print("ему нужно ходить в детский сад");
        if (age>=7 && age<=18) System.out.print("ему нужно ходить в школу");
        if (age>18 && age<=24) System.out.print("его место в университете");
        if (age>24 ) System.out.print("ему пора ходить на работу");

        System.out.println("\nДомашнее задание - 2");
        System.out.println("Возраст ребенка равен "+age+", ");
        if (age<=5 && age<=6) System.out.print("он не может кататься на аттракционе");
        if (age>=5 && age<=14) System.out.print("он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        if (age>14 ) System.out.print("он может кататься без сопровождения взрослого.");
        System.out.println("\nДомашнее задание - 3");
        int one=12;
        int two=22;
        int three=33;
if (one<three && two<three) System.out.println("Большее число "+three);
else if (one<two && three<two) System.out.println("Большее число "+two);
else if (two<one && one>three) System.out.println("Большее число "+one);




    }


}