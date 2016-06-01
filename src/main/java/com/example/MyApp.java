package com.example;

import com.jcabi.aspects.LogExceptions;
import com.jcabi.aspects.Loggable;
import com.jcabi.aspects.RetryOnFailure;

public class MyApp {

    //@Loggable(Loggable.DEBUG)
    //@LogExceptions
    @RetryOnFailure(attempts = 3, delay = 100)
    public void sayHi() {
        System.out.println("Hello World!");
        throw new RuntimeException("asdasd");
    }
    public static void main( String[] args ) {
        new MyApp().sayHi();
    }
}
