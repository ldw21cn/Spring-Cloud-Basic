package com.quyc.learn.javabasic.data_structures_and_algorithm_anlalysis;

public class TestMemoryCell {
    public static void main(String[] args) {
        MemoryCell<Integer> m = new MemoryCell<>();

        m.write(5);
        System.out.println("Contents are: " + m.read());
    }
}