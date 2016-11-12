package ru.sbt.lessons.servlet;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import ru.sbt.lessons.servlet.service.ServiceConfiguration;

/**
 * Created by SBTJavastudent on 12.11.2016.
 */
public class SpringAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        Class<?>[] classes = {ServiceConfiguration.class};
        return classes;
    }

    protected Class<?>[] getServletConfigClasses() {
//        Class<?>[] classes = {WebConfiguration.class};
//        return classes;
        return new Class<?>[0];
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
