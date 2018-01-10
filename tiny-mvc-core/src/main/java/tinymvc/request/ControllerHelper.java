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


package tinymvc.request;

import tinymvc.core.annotation.Action;
import tinymvc.core.tools.ClassHelper;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ControllerHelper {

    private static final Map<Request, Handler> requestMap = new HashMap<>();

    static {
        Set<Class<?>> classSet = ClassHelper.getController(getPackagePath());
        for (Class<?> clazz : classSet) {
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Action.class)) {
                    Action action = method.getAnnotation(Action.class);
                    Request request = buildRequest(action.method(), action.path());
                    Handler handler = buildHandler(clazz, method);
                    requestMap.put(request, handler);
                }
            }
        }
    }

    private static Request buildRequest(String method, String path) {
        return new Request(method, path);
    }

    private static Handler buildHandler(Class<?> clazz, Method method) {
        return new Handler(clazz, method);
    }

    private static String getPackagePath() {
        return "tinymvc.core.utils.classutil.classutilpkg";
    }

    public static Map<Request, Handler> getRequestMap() {
        return requestMap;
    }
}
