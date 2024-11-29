/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import bean.CalculationBean;

import jakarta.enterprise.context.ApplicationScoped;


import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.mvc.Controller;
import jakarta.mvc.Models;
import jakarta.mvc.View;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Named("calculationController")
@Controller
@ApplicationScoped
public class CalculationController {

    
    private int value ;
    private int subValue ;
     
    @Inject
    private CalculationBean calculationBean;

    public int getInitialValue() {
        return calculationBean.getInitialValue();
    }
    
      public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
     
    public int getSubValue() {
        return this.subValue;
    }
    
    public void setSubValue(int subValue) {
        this.subValue = subValue;
    }
    
    public String add() {
        calculationBean.add(value);
        return "calculation"; 
    }

    public String subtract() {
        calculationBean.subtract(subValue);
        return "calculation"; 
    }
}
