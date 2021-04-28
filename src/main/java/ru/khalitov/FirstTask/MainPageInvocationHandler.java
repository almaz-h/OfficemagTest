package ru.khalitov.FirstTask;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by almaz-h on 28.04.2021.
 */
public class MainPageInvocationHandler implements InvocationHandler {

    public MainPageInvocationHandler() {
    }

    public Object invoke(Object proxy, Method m, Object[] args) {
        return m.getAnnotation(Selector.class).xpath();
    }
}
