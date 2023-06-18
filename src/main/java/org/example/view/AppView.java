package org.example.view;

import org.example.controllers.ControllerHandler;

import java.io.IOException;
import java.util.Scanner;

public class AppView {

    Scanner scanner;


    public void chooseOption() throws IOException {
        scanner = new Scanner(System.in);

        System.out.print("""
                --------------------------
                Choose an option:
                1 - Add a contact.
                2 - View contacts.
                3 - Update the contact's phone number.A
                4 - Delete contact.
                0 - Close the app.
                """);
        int chooseResult = scanner.nextInt();

        new ControllerHandler().InputHandler(chooseResult);     // Передаем результат в контроллер для оброботки

    }



}
