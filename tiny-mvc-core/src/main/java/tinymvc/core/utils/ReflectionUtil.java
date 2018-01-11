/**
======================
@author : mantou
@date : 2017/11/29
======================
Description:

======================
Major changes:

*/


package tinymvc.core.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class ReflectionUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectionUtil.class);

    public static Object newInstance(Class<?> clazz) {
        Object instance;
        try {
            instance = clazz.newInstance();
        } catch (Exception e) {
            LOGGER.error("new instance failure", e);
            throw new RuntimeException(e);
        }
        return instance;
    }

    public static Object invokeMethod(Object object, Method method, Map<String, Object> param) {
        try {
            return method.invoke(object, param);
        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        }
        return null;
    }
}
