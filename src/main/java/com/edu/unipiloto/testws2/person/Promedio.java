/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unipiloto.testws2.person;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author USER
 */
@XmlRootElement(name = "promedio")
@XmlType(propOrder = {"average"})
public class Promedio {

    private double average;

    public Promedio(double average) {
        this.average = average;
    }

    public Promedio() {
    }
    

    @XmlElement
    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

}
