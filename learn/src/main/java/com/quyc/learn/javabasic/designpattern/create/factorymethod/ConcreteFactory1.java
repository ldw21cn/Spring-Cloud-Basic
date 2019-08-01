package com.quyc.learn.javabasic.designpattern.create.factorymethod;

import com.quyc.learn.javabasic.designpattern.create.simplefactory.ConcreteProduct1;
import com.quyc.learn.javabasic.designpattern.create.simplefactory.Product;

/**
 * Created by quyuanchao on 2019/2/16 18:04.
 * <p>Title: $TITLE</p>
 * <p>Description: $DESCRIPTION</p>
 */
public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
