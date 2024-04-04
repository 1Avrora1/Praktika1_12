/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz4;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Scanner;

/**
 *
 * @author NicSt
 */
public class Car implements Externalizable{
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isAutomatic;

    public Car() {
        // Пустой конструктор для Externalizable
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(brand);
        out.writeObject(model);
        out.writeInt(year);
        out.writeDouble(price);
        out.writeBoolean(isAutomatic);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        brand = (String) in.readObject();
        model = (String) in.readObject();
        year = in.readInt();
        price = in.readDouble();
        isAutomatic = in.readBoolean();
    }

    public void fillData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите марку автомобиля: ");
        brand = scanner.nextLine();

        System.out.print("Введите модель автомобиля: ");
        model = scanner.nextLine();

        System.out.print("Введите год выпуска автомобиля: ");
        year = scanner.nextInt();

        System.out.print("Введите цену автомобиля: ");
        price = scanner.nextDouble();

        System.out.print("Автомобиль с автоматической КПП ? (true/false): ");
        isAutomatic = scanner.nextBoolean();
    }

    @Override
    public String toString() {
        return "Автомобиль{" +
                "Марка = '" + brand + '\'' +
                ", Модель = '" + model + '\'' +
                ", Год выпуска = " + year +
                ", Цена = " + price +
                ", АКПП = " + isAutomatic +
                '}';
    }
}
