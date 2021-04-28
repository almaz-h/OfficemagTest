package ru.khalitov.SecondTask;

import org.junit.Test;
import org.testng.annotations.Listeners;

import static org.junit.Assert.assertEquals;

/**
 * Created by almaz-h on 28.04.2021.
 */
@Listeners(ListenerTest.class)
@TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
public class MainTest {

    public static void main(String[] args) {
        ListenerTest.ReadParams();
    }

    @Test
    public void annotation() {
        assertEquals(1, 1);
    }
}
