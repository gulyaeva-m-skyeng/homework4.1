public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }

//task2
        System.out.println("Task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " ");
        }

//task3
        System.out.println("Task 3");
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

//task4
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i + " ");
        }

//task5
        System.out.println("Task 5");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }

        //task6
        System.out.println("Task 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
    }
}

