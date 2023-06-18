package org.example.view;

import org.example.models.CreateModel;

import java.io.IOException;
import java.util.Scanner;

public class AppCreateView {


    public  void createAppView() throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your ID");
        int id = scanner.nextInt();
        System.out.println("Please enter your Name");
        String name = scanner.next();
        System.out.println("Please enter your Phone");
        int numberPhone = scanner.nextInt();

        new CreateModel().createContactBD(id, name, numberPhone);

    }
}
