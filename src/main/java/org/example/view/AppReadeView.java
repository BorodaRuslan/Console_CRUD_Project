package org.example.view;

import org.example.models.ReadModel;

import java.io.*;

public class AppReadeView {
    public void readFile() throws IOException {
        new ReadModel().readDataBase();           // Данные улетают на контроллер


    }
}
