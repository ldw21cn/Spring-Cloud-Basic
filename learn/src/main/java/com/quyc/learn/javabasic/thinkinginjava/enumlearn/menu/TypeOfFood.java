//: enumerated/menu/TypeOfFood.java
package com.quyc.learn.javabasic.thinkinginjava.enumlearn.menu;


public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Food.Appetizer.SALAD;
        food = Food.MainCourse.LASAGNE;
        food = Food.Dessert.GELATO;
        food = Food.Coffee.CAPPUCCINO;
    }
} ///:~
