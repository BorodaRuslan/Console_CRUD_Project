package org.example.models;

import java.io.*;

public class CreateModel {
    private final File file = new File("TestBD.txt");

    /*
         Этот класс отвечает за сохранение данных в базе

     */
    public void createContactBD(int id, String name, int phone) throws IOException {    // Принемаем на вход созданые данные

        // Тут должна быть логика сохранения данных в Базу!

        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Id: " + id + " Name: " + name + " Phone: " + phone);
        bufferedWriter.newLine();
        bufferedWriter.close();

        System.out.println("The data was successfully saved to the database!");

    }





}
