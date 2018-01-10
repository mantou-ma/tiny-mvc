/***
======================
@author : mantou
@date : 2017/11/29
======================
Description:

======================
Major changes:

***/


package utils;

import utils.classutil.ClassUtil;

import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Set<Class<?>> classSet = ClassUtil.getClassSet("utils.classutil");
        System.out.printf(classSet.toString());
    }
}
