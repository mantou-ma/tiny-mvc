/**
 * ======================
 *
 * @author : mantou
 * @date : 2018/1/11
 * ======================
 * Description:
 * <p/>
 * ======================
 * Major changes:
 */


package com.mantou.tinymvc.controller;


import tinymvc.core.annotation.Action;
import tinymvc.core.annotation.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DemoController2 {

    @Action(method = "GET", path = "/")
    public Object getMethod(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return "";
    }

    @Action(method = "POST", path = "/demo/post2")
    public Object demoMethonPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return null;
    }
}
