package dev.srylax.bbbassets.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingletonTest {

    @Test
    @SuppressWarnings({"rawtypes", "unchecked"})
    void testSingleton() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        ArrayList list = Singleton.getInstance(ArrayList.class, null, null);
        list.add("test");

        assertEquals(list, Singleton.getInstance(ArrayList.class, null, null));
    }

}