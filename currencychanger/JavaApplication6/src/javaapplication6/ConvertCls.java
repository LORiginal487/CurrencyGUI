/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author User
 */
public class ConvertCls {
    Double inAmnt;
    Double outAmnt;
    String toCrrn;

    
    
    public ConvertCls(Double inAmnt, Double outAmnt, String toCrrn) {
        this.inAmnt = inAmnt;
        this.outAmnt = outAmnt;
        this.toCrrn = toCrrn;
    }

    public Double getInAmnt() {
        return inAmnt;
    }

    public void setInAmnt(Double inAmnt) {
        this.inAmnt = inAmnt;
    }

    public Double getOutAmnt() {
        
        return outAmnt;
    }

    public void setOutAmnt(Double outAmnt) {
        switch (toCrrn) {
            case "bric":
                outAmnt = inAmnt * 100;
                break;
            case "usd":
                outAmnt = inAmnt * 20;
                break;
            case "eur":
                outAmnt = inAmnt * 27;
                break;
            case "yen":
                outAmnt = inAmnt * 15;
                break;
            case "nar":
                outAmnt = inAmnt * 0.25;
                break;
            default:
                outAmnt = inAmnt;
               
        }
        this.outAmnt = outAmnt;
        
    }

    public String getToCrrn() {
        return toCrrn;
    }

    public void setToCrrn(String toCrrn) {
        this.toCrrn = toCrrn;
    }
    
    
    
}
