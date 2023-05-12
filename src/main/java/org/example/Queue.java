package org.example;
import java.util.Random;
import java.util.Scanner;

public class Queue implements QueueInter {
    @Override
    public void fillArray(Scanner scanner, QueueArray queueArray) {
        double s = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i <= 1000; i++) {
            queueArray.add(random.nextInt(-500, 500));
        }
        double e = System.currentTimeMillis();
        double t = e - s;
        System.out.println("Часу витрачено: " + t);
    }
    @Override
    public void fillLink(Scanner scanner, QueueLink queueLinkList) {
        double s = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i <= 500; i++) {
            queueLinkList.add(random.nextInt(0, 500));
        }
        for (int i = 0; i <= 500; i++) {
            queueLinkList.add(random.nextInt(-500, 0));
        }
        double e = System.currentTimeMillis();
        double t = e - s;
        System.out.println("Часу витрачено: " + t);

    }
    @Override
    public void addNumberArray(Scanner scanner, QueueArray queueArray) {
        double s = System.currentTimeMillis();
        System.out.println("Введіть число: ");
        int num = scanner.nextInt();
        queueArray.add(num);
        double e = System.currentTimeMillis();
        double t = e - s;
        System.out.println("Часу витрачено: " + t);

    }
    @Override
    public void addNumberLink(Scanner scanner, QueueLink queueLinkList) {
        double s = System.currentTimeMillis();
        System.out.println("Введіть число: ");
        int num = scanner.nextInt();
        queueLinkList.add(num);
        double e = System.currentTimeMillis();
        double t = e - s;
        System.out.println("Часу витрачено: " + t);

    }
}