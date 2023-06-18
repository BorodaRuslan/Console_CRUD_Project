package org.example.controllers;

import org.example.view.AppCreateView;
import org.example.view.AppReadeView;

import java.io.IOException;

public class ControllerHandler {
    
    public void InputHandler(int choice) throws IOException {
        switch (choice) {
            case 1 ->  new AppCreateView().createAppView();     // сохранение в file реализовано
            case 2 -> new AppReadeView().readFile();           // Чтение из файла
        }
    }


}
