/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import bean.CalculationBean;
import controllers.BeanMetadataReader;

/**
 *
 * @author lirir
 */
public class Test {
    
    public static void main(String[] args) {
        BeanMetadataReader metadataReader = new BeanMetadataReader();
        metadataReader.inspectBean(CalculationBean.class);
    }
}
