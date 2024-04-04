/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author NicSt
 */
public class SaverRunnable implements Runnable{
    private Car car;
    private String path;

    public SaverRunnable(Car car, String path) {
        this.car = car;
        this.path = path;
    }
    
    @Override
    public void run(){
        if(this.path!=null && car!=null){
            try {
                FileOutputStream fileOut = new FileOutputStream(this.path);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(car);
                out.close();
                fileOut.close();
                System.out.println("Объект машина сериализован. Файл сохранен в: " + this.path);
            } 
            catch (Exception e){
                System.out.println("Ошибка сохранения объекта в: " + this.path);
            }
        }
    }
}
