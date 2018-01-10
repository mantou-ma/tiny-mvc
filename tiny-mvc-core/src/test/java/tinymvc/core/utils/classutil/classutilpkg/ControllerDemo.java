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


package tinymvc.core.utils.classutil.classutilpkg;

import tinymvc.core.annotation.Action;
import tinymvc.core.annotation.Controller;


@Controller
public class ControllerDemo {

    @Action(method = "GET", path = "/demo/get")
    public Object getMethod() {
        return null;
    }

    @Action(method = "POST", path = "/demo/post")
    public Object demoMethonPost() {
        return null;
    }
}
