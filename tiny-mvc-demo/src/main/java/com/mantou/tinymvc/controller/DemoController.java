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
public class DemoController {

    @Action(method = "GET", path = "/demo/get")
    public Object getMethod(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return null;
    }

    @Action(method = "POST", path = "/demo/post")
    public Object demoMethonPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return null;
    }
}
