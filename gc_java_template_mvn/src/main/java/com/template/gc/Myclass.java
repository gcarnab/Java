package com.template.gc;

/**
 * The class "Myclass" is a Java class that has a private instance variable
 * "name" and getter and
 * setter methods for accessing and modifying the value of "name".
 * 
 * @author [GCARNAB]
 * @version [1.0]
 */
public class Myclass {
    private String name;

    public Myclass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The function returns a greeting message.
     * 
     * @return The string "Hello GCARNAB" is being returned.
     */
    public String Greetings(){
        return "Hello GCARNAB";
    }
}
