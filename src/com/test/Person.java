package com.test;

import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person> {//для отсортировки объектов, необходимо реализовать интерфейс Comparable
    int age;

    public Person(int age) {
        this.age = age;
    }//Конструктор

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    } //переопределение метода compareTo

    @Override//переопределяем метод toString для красивого вывода результатов
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person(55);//создаем объекты Person
        Person p2 = new Person(35);
        Person p3 = new Person(15);
        Person p4 = new Person(25);
        Set<Person> set = new TreeSet<>();//Создаем упорядоченный массив Set
        set.add(p1);//добавляем элементы
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for (Object o : set) {//проходим по всем элементам и их выводим
            System.out.println(o);
        }
    }
}
/*
OUTPUT:
Person{age=15}
Person{age=25}
Person{age=35}
Person{age=55}

*/
