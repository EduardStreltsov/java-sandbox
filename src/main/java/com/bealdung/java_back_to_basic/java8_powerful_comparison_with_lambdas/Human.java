package com.bealdung.java_back_to_basic.java8_powerful_comparison_with_lambdas;

//http://www.baeldung.com/java-8-sort-lambda?utm_source=email-newsletter&utm_medium=email&utm_campaign=auto_33_java&tl_inbound=1&tl_target_all=1&tl_period_type=3

import org.junit.Test;

import java.util.*;

public class Human {
    
    private String name;
    private int age;
    
    public Human() {
        super();
    }
    
    public Human(String name, int age){
        super();
        
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && name.equals(human.name);
    }
    
    @Override
    public int hashCode() {
        
        return Objects.hash(name, age);
    }
    //    standard getters, setters, equals and hashcode

    @Test
    public void givenPreLambda_whenSortingEntitiesByName_thenCorrectlySorted() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Sarah", 10));
        humans.add(new Human("Jack", 12));
    
        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return h1.getName().compareTo(h2.getName());
            }
        });
        
    }
    
}
