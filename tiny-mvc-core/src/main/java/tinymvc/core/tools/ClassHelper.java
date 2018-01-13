/**
 * ======================
 *
 * @author : mantou
 * @date : 2018/1/10
 * ======================
 * Description:
 * <p/>
 * ======================
 * Major changes:
 * <p/>
 * *
 */


package tinymvc.core.tools;

import tinymvc.core.annotation.Controller;
import tinymvc.core.utils.ClassUtil;

import java.util.Set;

public class ClassHelper {

    public static Set<Class<?>> getController(String packageName) {
        Set<Class<?>> classSet = ClassUtil.getClassSet(packageName);
        return ClassUtil.getClassSetByAnnotation(classSet, Controller.class);
    }
}
