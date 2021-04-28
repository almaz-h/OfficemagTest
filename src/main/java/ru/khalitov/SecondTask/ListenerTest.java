package ru.khalitov.SecondTask;

import org.testng.ITestNGListener;

/**
 * Created by almaz-h on 28.04.2021.
 */
public class ListenerTest implements ITestNGListener{

    public static void ReadParams() {
        TestMethodInfo annotation = MainTest.class.getAnnotation(TestMethodInfo.class);
        System.out.println(annotation.priority() + " " + annotation.author() + " " + annotation.lastModified());

    }

}
