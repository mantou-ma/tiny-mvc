/* 
======================
@author : mantou
@date : 2017/11/29
======================
Description:

======================
Major changs:

*/

package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public final class ClassUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassUtil.class);

    public static ClassLoader getClassLoader() {
        return Thread.currentThread().getContextClassLoader();
//        return ClassUtil.getClassLoader();
    }

    public static Class<?> loadClass(String className, boolean isInitialized) {
        Class<?> clazz;
        try {
            clazz = getClassLoader().loadClass(className);
        } catch (ClassNotFoundException e) {
            LOGGER.error("class {} not found", className, e);
            throw new RuntimeException(e);
        }
        return clazz;
    }

    public static Set<Class<?>> getClassSet(String packageName) {
        Set<Class<?>> classSet = new HashSet<>();
        return classSet;
    }
}
