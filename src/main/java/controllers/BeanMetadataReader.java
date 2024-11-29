/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import bean.CalculationBean;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

public class BeanMetadataReader {

    public static void inspectBean(Class<?> beanClass) {
        System.out.println("Class Name: " + beanClass.getName());
        System.out.println("\nFields:");
        for (Field field : beanClass.getDeclaredFields()) {
            System.out.println(" - " + field.getName() + " (Type: " + field.getType().getName() + ")");
        }
        System.out.println("\nMethods:");
        for (Method method : beanClass.getDeclaredMethods()) {
            System.out.println(" - " + method.getName() + " (Return Type: " + method.getReturnType().getName() + ")");
        }
        System.out.println("\nAnnotations:");
        for (Annotation annotation : beanClass.getAnnotations()) {
            System.out.println(" - " + annotation.annotationType().getName());
        }
    }

    public static void main(String[] args) {      
        inspectBean(CalculationBean.class);
    }
}
