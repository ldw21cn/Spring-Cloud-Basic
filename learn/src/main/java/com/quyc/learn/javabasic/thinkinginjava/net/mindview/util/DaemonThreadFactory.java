//: net/mindview/util/DaemonThreadFactory.java
package com.quyc.learn.javabasic.thinkinginjava.net.mindview.util;

import java.util.concurrent.ThreadFactory;

public class DaemonThreadFactory implements ThreadFactory {
  @Override
  public Thread newThread(Runnable r) {
    Thread t = new Thread(r);
    t.setDaemon(true);
    return t;
  }
} ///:~
