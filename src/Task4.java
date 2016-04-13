/*
 * В этой проге класс Cat подчиняется свойству инкапсуляции
 */


/*
 * Эта прога на основе класса Pet создает классы Cat и Dog наследованием
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class rread {
    public static String readln() {
        String s="";
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        try {
            s = bufferedReader.readLine(); //читаем строку с клавиатуры
        }
        catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
        }
        
        return s;
    }
}

class Pet {
    private int age;
    private double weight;
    
    public void set(int a, double b) {
        age=a;
        weight=b;
    }
    
    public void get() {
        System.out.print(" Возраст: "+age+" Вес: "+weight);
    }
    
}

class Cat extends Pet {
    private String name;
    
    public void inits(int a, double b, String c) {//инициализация полей
        set(a,b);
        name=c;  
    }
    
    public void get1() {//вывод содержимого
        System.out.println("\nКличка: "+name);
        get();
    }
    
    Cat(int a, double b, String c) {
        int aa; double bb; String cc;
        aa=a;
        bb=b;
        cc=c;
        inits(aa,bb,cc);
    }
}

public class Task4 {
    public static void main(String[] args) {
        rread obj = new rread();
        String s1;
        int age;
        double wes;
        System.out.print("Введите имя кота:");
        s1=obj.readln();
        System.out.print("Введите возраст кота:");
        age=Integer.parseInt(obj.readln());
        System.out.print("Введите вес кота:");
        wes=Double.parseDouble(obj.readln());
        Cat obj1 = new Cat(age,wes,s1);
        obj1.get1();
    }
}
