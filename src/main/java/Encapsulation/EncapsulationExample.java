/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author nitro 5
 */
public class EncapsulationExample {

    private String name;
    private int id;
    
    public String getName(){
        return name;
    }
    public void SetName(String NAME){
        this.name=NAME;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int ID){
        this.id=ID;
    }
    
    public static void main(String[] args) {
        EncapsulationExample obj = new EncapsulationExample();
        obj.getName();
        obj.SetName("KISWOR");
        obj.getId();
        obj.setId(100);
        System.out.println("My name is "+obj.getName()+" and my id is "+obj.getId());
    }
    
}
