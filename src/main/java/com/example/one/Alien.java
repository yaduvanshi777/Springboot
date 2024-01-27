package com.example.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien {

    /**
     * This is the constructor of the Alien class.
     *
     * @return nothing
     */

    public Alien(){
        super();
        System.out.println("object created");
    }

    private int aid;
    private String name;
    private String tech;


    @Autowired   // is search by type
    @Qualifier("lapvivek")  // search by name
    private Laptop laptop;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void show(){
        System.out.println("================================welcomw ++++");
        laptop.compile();
    }



}
