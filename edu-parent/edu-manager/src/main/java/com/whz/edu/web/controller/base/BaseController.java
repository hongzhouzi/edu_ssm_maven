package com.whz.edu.web.controller.base;

import java.lang.reflect.ParameterizedType;

public abstract class BaseController<T> {
    public static String MANAGE_PAGE;
    public static String INFO_PAGE;
    public static String EDIT_PAGE;
    public static String FIND_PAGE;
    public static final String MANAGE = "manage";
    public static final String INFO = "info";
    public static final String EDIT = "edit";
    public static final String FIND = "find";

    public BaseController() {
        //1、获取泛型的真实类型
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class<?> modelClass = (Class<?>) type.getActualTypeArguments()[0];
        //2、获取模块名，并将名字转为小写
        String modelName = modelClass.getSimpleName().toLowerCase();
        //3、给静态页面赋值
        MANAGE_PAGE = modelName + "/" + MANAGE;
        INFO_PAGE = modelName + "/" + INFO;
        EDIT_PAGE = modelName + "/" + EDIT;
        FIND_PAGE = modelName + "/" + FIND;
    }
}
