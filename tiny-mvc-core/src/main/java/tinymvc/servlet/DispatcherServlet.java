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


package tinymvc.servlet;

import tinymvc.core.tools.ControllerHelper;
import tinymvc.core.tools.HelpLoader;
import tinymvc.core.tools.IOCHelper;
import tinymvc.core.utils.ReflectionUtil;
import tinymvc.request.Handler;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/*", loadOnStartup = 0)
public class DispatcherServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        HelpLoader.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestMethod = req.getMethod().toUpperCase();
        String requestPath = req.getPathInfo();
        Handler handler = ControllerHelper.getHandler(requestMethod, requestPath);
        if (null != handler) {
            Class<?> clazz = handler.getControllerClass();
            Method method = handler.getMethod();
            Object controller = IOCHelper.getBean(clazz.getName());
            Map<String, Object> paramMap = new HashMap<>();

            Enumeration<String> paramNames = req.getParameterNames();
            while (paramNames.hasMoreElements()) {
                String param = paramNames.nextElement();
                String value = req.getParameter(param);
                paramMap.put(param, value);
            }

            Object res = ReflectionUtil.invokeMethod(controller, method, paramMap);
        } else {
            return;
        }
    }
}
