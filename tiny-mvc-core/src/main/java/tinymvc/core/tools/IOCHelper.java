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
 */


package tinymvc.core.tools;

import tinymvc.core.utils.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IocHelper {

    private static Map<Class<?>, Object> CONTROLLER_BEAN_MAP = new HashMap<>();

    static {
        addController();
    }

    private static void addController() {
        Set<Class<?>> controllerClass = ControllerHelper.getControllerClassSet();
        for (Class<?> clazz : controllerClass) {
            Object controller = ReflectionUtil.newInstance(clazz);
            CONTROLLER_BEAN_MAP.put(clazz, controller);
        }
    }

    public static <T> T getBean(Class<T> clazz) {
        return (T)CONTROLLER_BEAN_MAP.get(clazz);
    }
}
