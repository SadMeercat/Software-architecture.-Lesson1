package ru.geekbrains.lesson1.homework.ModelElements;

import java.awt.*;

/**
 * Источник света
 * TODO: Доработать самостоятельно в рамках домашней работы
 */
public class Flash {
    public Point3D Location;
    public Angle3D Angle;
    public Color Color;
    public float Power;

    public void Rotate(Angle3D angle){};
    public void Move (Point3D point){};
}
