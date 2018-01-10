/***
======================
@author : mantou
@date : 2017/11/29
======================
Description:

======================
Major changes:

***/


package tinymvc.core.utils;

import tinymvc.core.annotation.Controller;
import tinymvc.core.utils.classutil.ClassUtil;
import tinymvc.request.ControllerHelper;

import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Set<Class<?>> classSet = null;
        classSet = ClassUtil.getClassSet(Thread.currentThread().getContextClassLoader(), "tinymvc.core.utils.classutil");
        classSet = ClassUtil.getClassSetByAnnotation(classSet, Controller.class);

        System.out.println(ControllerHelper.getRequestMap());
    }
}
