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

import tinymvc.core.annotation.Controller;
import tinymvc.core.utils.ClassUtil;

public class HelpLoader {

    public static void init() {

        Class<?> [] classes = {Controller.class,};
        for (Class<?> clazz : classes) {
            ClassUtil.loadClass(clazz.getName(), true);
        }

    }
}
