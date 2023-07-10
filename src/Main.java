public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog+"\n"+cat+"\n"+paper);
    }
    public static void task2() {
        System.out.println("Задача 2:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog+"\n"+cat+"\n"+paper);
    }
    public static void task3() {
        System.out.println("Задача 3:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog+"\n"+cat+"\n"+paper);
    }
    public static void task4() {
        System.out.println("Задача 4:");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5:");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6:");
        var firstBoxer = 78.2;
        System.out.println("Вес первого боксера " + firstBoxer + "кг");
        var secondBoxer = 82.7;
        System.out.println("Вес второго боксера " + secondBoxer + "кг");
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес бойцов " + totalWeight + "кг!");
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе составляет "+ weightDifference + "кг!");
    }
    public static void task7() {
        System.out.println("Задача 7:");
        var firstBoxer = 78.2;
        System.out.println("Вес первого боксера " + firstBoxer + "кг");
        var secondBoxer = 82.7;
        System.out.println("Вес второго боксера " + secondBoxer + "кг");
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе составляет "+ weightDifference + "кг!");
        weightDifference = secondBoxer % firstBoxer;
        System.out.println("Разница в весе составляет "+ weightDifference + "кг!");
    }
    public static void task8() {
        System.out.println("Задача 8:");
        var totalWorkingHours = 640;
        var employeeWorkingHours = 8;
        var employeesNumber = totalWorkingHours / employeeWorkingHours;
        System.out.println("Всего работников в компании - " + employeesNumber + " человек");
        employeesNumber = employeesNumber + 94;
        totalWorkingHours = employeesNumber * employeeWorkingHours;
        System.out.println("Если в компании работает "+ employeesNumber + " человека, то всего " + totalWorkingHours + " часа работы может быть поделено между сотрудниками");

    }
}