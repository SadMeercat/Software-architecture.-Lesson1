package ru.geekbrains.lesson1.homework.ModelElements;

import java.util.ArrayList;
import java.util.List;

/**
 * Сцена
 * TODO: Доработать самостоятельно в рамках домашней работы
 */
public class Scene {
    public int id;
    public List<PoligonalModel> models = new ArrayList<>();
    public List<Flash> flashes = new ArrayList<>();
    public Flash method1(Flash flash){
        return flash;
    }
    public int method2(int num1, int num2){
        return num1 + num2;
    }
}
