/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author lirir
 */
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class CalculationBean {

    private int initialValue =20;
    
    
    @Produces
    public int getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(int initialValue) {
        this.initialValue = initialValue;
    }

    public int add(int value) {
        initialValue += value;
        return initialValue;
    }

    public int subtract(int value) {
        initialValue -= value;
        return initialValue;
    }
}
