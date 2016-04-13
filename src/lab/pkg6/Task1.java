/*
 Эта прог-а на основе класса "Лошадь" наследует класс "Пегас"
 */
package lab.pkg6;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class Horse {
    String name;
    Horse() {
        
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String s1="";
        
        try {
            System.out.print("\nВведите кличку лошади: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
            return;
        }
        
        this.name=s1;
        System.out.print("\nЛошадь: "+this.name);
    }
}

class Pegas extends Horse{
    public void flight() {
        System.out.print("\nПегас "+this.name+" летит!");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Pegas obj2=new Pegas();
        obj2.flight();
    }
}
