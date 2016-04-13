/*
 * Эта прога наследует классы по след. схеме:
    Fish->Animal->Ape->Human
 */
package lab.pkg6;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class Fish {
    int age;
    double weight;
    int canSwim;
    int sex;
    String name;
    
    Fish() {//конструктор
        String s2="рыбы";
        this.vvod();
    }
    
    public void vvod() {//ввод
        String s1;
        
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        try {
            System.out.print("\nВведите имя рыбы:");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.name=s1;
            System.out.print("\nВведите возраст: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.age=Integer.parseInt(s1);
            System.out.print("\nВведите пол (0 или 1): ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.sex=Integer.parseInt(s1);
            System.out.print("\nМожет плавать? (0 или 1): ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.canSwim=Integer.parseInt(s1);
            System.out.print("\nВведите вес: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.weight=Double.parseDouble(s1); 
        } 
        catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
            return;
        }
    }
    
    public void vivod() {//вывод
        if (this.sex==0) System.out.print("\nRiba "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
        else if (this.sex==1) System.out.print("\nRib "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
        if (this.canSwim==0) System.out.print(" Ne mozhet plavat.");
        else if (this.canSwim==1) System.out.print(" Mozhet plavat.");
    }
    
}

class Animal extends Fish {
    int canRun;
    
    Animal() {//конструктор
        String s2="животного";
        this.vvod1();
    }
    
    public void vvod1() {//ввод
        String s1;
        
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        try {
            System.out.print("\nВведите имя животного:");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.name=s1;
            System.out.print("\nВведите возраст: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.age=Integer.parseInt(s1);
            System.out.print("\nВведите пол (0 или 1): ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.sex=Integer.parseInt(s1);
            System.out.print("\nМожет плавать? (0 или 1): ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.canSwim=Integer.parseInt(s1);
            System.out.print("\nВведите вес: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.weight=Double.parseDouble(s1);
            System.out.print("\nМожет бегать? ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.canRun=Integer.parseInt(s1); 
        } 
        catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
            return;
        }
    }
    
    public void vivod1() {
        if (this.sex==0) System.out.print("\nRiba "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
        else if (this.sex==1) System.out.print("\nRib "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
        if (this.canSwim==0) System.out.print(" Ne mozhet plavat.");
        else if (this.canSwim==1) System.out.print(" Mozhet plavat.");
        if (this.canRun==0) System.out.print(" Ne mozhet xodit'.");
        else if (this.canRun==1) System.out.print(" Mozhet xodit'.");
    }
}

class Ape extends Animal {
    int IQ;
    
    Ape() {
        String s2="обезъяны";
        this.vvod2();
    }
    
    public void vvod2() {
        String s1;
        
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        try {
            System.out.print("\nВведите имя животного:");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.name=s1;
            System.out.print("\nВведите возраст: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.age=Integer.parseInt(s1);
            System.out.print("\nВведите пол (0 или 1): ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.sex=Integer.parseInt(s1);
            System.out.print("\nМожет плавать? (0 или 1): ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.canSwim=Integer.parseInt(s1);
            System.out.print("\nВведите вес: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.weight=Double.parseDouble(s1);
            System.out.print("\nМожет бегать? ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.canRun=Integer.parseInt(s1);
            System.out.print("\nВведите IQ (для обезъян <35)? ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.canRun=Integer.parseInt(s1); 
        } 
        catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
            return;
        }
    }
    
    public void vivod2() {
        if (this.sex==0) System.out.print("\nRiba "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
        else if (this.sex==1) System.out.print("\nRib "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
        if (this.canSwim==0) System.out.print(" Ne mozhet plavat.");
        else if (this.canSwim==1) System.out.print(" Mozhet plavat.");
        if (this.canRun==0) System.out.print(" Ne mozhet xodit'.");
        else if (this.canRun==1) System.out.print(" Mozhet xodit'.");
        if ((IQ<35) && (IQ>=20)) System.out.print(" Может выполнять примитивные действия");//FIXME
        else if ((IQ<20) && (IQ>0)) System.out.print(" Скачет и ничего не понимает");
        else System.out.print(" Это человек или введен непр. IQ<0");
    }
}

class Human extends Ape {
    String s2="человека";
    
    Human() {
        String s2="человека";
        this.vvod2();
    }
    
    public void vivod3() {
        if (this.sex==0) System.out.print("\nRiba "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
        else if (this.sex==1) System.out.print("\nRib "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
        if (this.canSwim==0) System.out.print(" Ne mozhet plavat.");
        else if (this.canSwim==1) System.out.print(" Mozhet plavat.");
        if (this.canRun==0) System.out.print(" Ne mozhet xodit'.");
        else if (this.canRun==1) System.out.print(" Mozhet xodit'.");
        
        if (this.IQ<20) System.out.print(" Идиот");
        else if ((this.IQ>=20) && (this.IQ<=49)) System.out.print(" Имбецил");
        else if ((this.IQ>=50) && (this.IQ<=69)) System.out.print(" Дебил");
        else if ((this.IQ>=70) && (this.IQ<=89)) System.out.print(" Немного отстает");
        else if ((this.IQ>=90) && (this.IQ<=109)) System.out.print(" Нормальный интеллект");
        else if ((this.IQ>=110) && (this.IQ<=129)) System.out.print(" Просвещенный");
        else if ((this.IQ>=130) && (this.IQ<=159)) System.out.print(" Ученый");
        else if ((this.IQ>=160) && (this.IQ<=200)) System.out.print(" Гений");
        else if ((this.IQ>=200)) System.out.print(" Исключительный интеллект");
        
    }
}

public class Task3 {
    
    public static void main(String[] args) {
        Fish obj1 = new Fish();
        obj1.vivod();
        Animal obj2 = new Animal();
        obj2.vivod1();
        Ape obj3 = new Ape();
        obj3.vivod2();
        Human obj4 = new Human();
        obj4.vivod3();
    }
}
