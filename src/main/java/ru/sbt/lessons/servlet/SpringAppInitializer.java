package ru.sbt.lessons.servlet;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by SBTJavastudent on 12.11.2016.
 */
public class SpringAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        Class<?>[] classes = {ServiceConfiguration.class};
        return classes;
    }

    protected Class<?>[] getServletConfigClasses() {
        Class<?>[] classes = {WebConfiguration.class};
        return classes;
    }

    protected String[] getServletMappings() {
        return new String[] {"/spring"};
    }
}
