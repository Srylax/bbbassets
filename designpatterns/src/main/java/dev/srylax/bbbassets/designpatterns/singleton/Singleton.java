package dev.srylax.bbbassets.designpatterns.singleton;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Singleton manager. Safes all singleton instances in a map.
 * <p>
 * This may not be applicable to your situation. If you want to implement a Singleton, without a manager, intellij provides the {@code geti} shortcut.
 * <p>
 * <img src="doc-files/singleton.png" alt="Singleton">
 */
public class Singleton {

    /**
     * Singleton instances.
     */
    @SuppressWarnings("rawtypes")
    protected static final Map<Class, Object> instances = new java.util.HashMap<>();

    /**
     * Protected Constructor so no instance can be created. AND it can be accessed by child classes.
     */
    protected Singleton() {
    }

    /**
     * Get singleton instance.
     *
     * @param clazz      Class of the singleton instance.
     * @param paramTypes Constructor parameter types. Nullable
     * @param initArgs   Constructor arguments. Nullable
     * @param <T>        Type of the singleton instance.
     * @return Singleton instance.
     * @throws InvocationTargetException If the constructor throws an exception.
     * @throws InstantiationException    If the class is abstract.
     * @throws IllegalAccessException    If the constructor is not accessible.
     * @throws NoSuchMethodException     If the constructor does not exist.
     */
    @SuppressWarnings("unchecked")
    public static <T> T getInstance(Class<T> clazz, Class<?>[] paramTypes, Object[] initArgs) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        if (!instances.containsKey(clazz)) {
            instances.put(clazz, clazz.getConstructor(paramTypes).newInstance(initArgs));
        }
        return (T) instances.get(clazz);
    }
}
