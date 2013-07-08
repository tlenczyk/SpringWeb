/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tls.beans;

/**
 *
 * @author tomek
 */
public class MyBean {

    private String name;

    public void init() {
        System.out.println("init1");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
