/*
 * Эта прога на основе класса Pet создает классы Cat и Dog наследованием
 */
package lab.pkg6;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class Pet {
    int age;
    int sex;
    double weight;
}

class Cat extends Pet {
    String name;
    
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    
    Cat() {
        String s1;
        try {
            System.out.print("\nВведите имя кота: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.name=s1;
            System.out.print("\nВведите возраст: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.age=Integer.parseInt(s1);
            System.out.print("\nВведите пол (0 или 1): ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.sex=Integer.parseInt(s1);
            System.out.print("\nВведите вес: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.weight=Double.parseDouble(s1); 
        } 
        catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
            return;
        }
    }
    
    public void vivod() {
        if (sex==0) System.out.print("Koshka "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
        else if (sex==1) System.out.print("Kot "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
    }
}

class Dog extends Pet {
    String name;
    
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    
    Dog() {
        String s1;
        try {
            System.out.print("\nВведите имя собаки: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.name=s1;
            System.out.print("\nВведите возраст: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.age=Integer.parseInt(s1);
            System.out.print("\nВведите пол (0 или 1): ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.sex=Integer.parseInt(s1);
            System.out.print("\nВведите вес: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.weight=Double.parseDouble(s1); 
        } 
        catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
            return;
        }
}
    
    public void vivod() {
        if (sex==0) System.out.print("Sobaka "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
        else if (sex==1) System.out.print("Pes "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
    }
    
}

public class Task2 {
    public static void main(String[] args) {
        Cat obj1=new Cat();
        obj1.vivod();
        Dog obj2=new Dog();
        obj2.vivod();
    }
}
