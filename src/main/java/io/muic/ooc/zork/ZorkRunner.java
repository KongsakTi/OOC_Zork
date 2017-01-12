package io.muic.ooc.chatbot;

import java.util.Scanner;

/**
 * This is the main class.
 *
 * @author gigadot
 */
public class ZorkRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Zork: Hello, I am Mr. Bot.");
        while (!quit) {
            System.out.print("You: ");
            String name = scanner.nextLine();
            quit = name.equals("quit");
            if (!quit) {
                System.out.println("Zork: " + name);
            }
        }
    }

}
