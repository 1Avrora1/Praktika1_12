/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


/**
 *
 * @author NicSt
 */
public class LoaderRunnable implements Runnable{
    private String path;

    public LoaderRunnable(String path) {
        this.path = path;
    }
    
    @Override
    public void run(){
        if(this.path!=null && new File(this.path).exists()){
            try {
                FileInputStream fileIn = new FileInputStream(path);
                ObjectInputStream in = new ObjectInputStream(fileIn);
                Car car = (Car)in.readObject();
                in.close();
                System.out.println(car.toString());
            } 
            catch (ClassNotFoundException | IOException e){
                System.out.println("Ошибка загрузки объекта из: " + this.path);
                System.out.println(e.getMessage());
            }
        }
    }
}
