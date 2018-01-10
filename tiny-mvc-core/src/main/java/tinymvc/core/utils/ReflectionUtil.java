/* 
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
}
