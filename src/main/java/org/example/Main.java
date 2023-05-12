package org.example;

import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
            Main main = new Main();
            main.run();
        }
        private void run(){
            QueueInter queue = new Queue();
            Scanner scanner = new Scanner(System.in);
            QueueLink queueLink = new QueueLink();
            QueueArray queueArray = new QueueArray();
            loop:
            while (true){
                option();
                System.out.println("Введіть номер :");
                int opt = scanner.nextInt();
                switch (opt){
                    case 1 -> queue.fillArray(scanner, queueArray);
                    case 2 -> queue.addNumberArray(scanner,queueArray);
                    case 3 -> System.out.println(queueArray.remove());
                    case 4 -> System.out.println(queueArray);
                    case 5 -> queue.fillLink(scanner, queueLink);
                    case 6 -> queue.addNumberLink(scanner, queueLink);
                    case 7 -> System.out.println(queueLink.remove());
                    case 8 -> System.out.println(queueLink);
                    case 9 -> {break loop;}
                }
            }
        }
        private void option() {
            System.out.println("""
                    **********************
                    1-Заповнити масив
                    2-Додати число для масиву
                    3-Видалити число з масиву
                    4-Показати відсортований масив 
                    5-Заповнити список
                    6-Додати число у список
                    7-Видалити число з списку
                    8-Показати відсортований список
                    9-Завершити програму
                    **********************
                    """);
        }
}