package org.example;
import java.util.Scanner;

public interface QueueInter {
    void fillArray(Scanner scanner, QueueArray hA);
    void fillLink(Scanner scanner, QueueLink hL);
    void addNumberArray(Scanner scanner, QueueArray queueArray);
    void addNumberLink(Scanner scanner, QueueLink queueLink);
}