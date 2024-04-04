/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dz4;


/**
 *
 * @author NicSt
 */
public class DZ4 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Практическое задание - 1.12, Студент - Стрыгин Никита Владиславович, Группа - РИБО-03-22, Вариант - 1");
        System.out.println("Перед выполнением работы убедитесь, что программа запущена от имени администратора");
        Car car = new Car();
        car.fillData();
        SaverRunnable sr = new SaverRunnable(car, "C:\\car_data.ser"); 
        LoaderRunnable lr = new LoaderRunnable("C:\\car_data.ser");
        Thread thsr = new Thread(sr);
        thsr.start();
        thsr.join();
        Thread thlr = new Thread(lr);
        thlr.start();
        
    }
    
}
