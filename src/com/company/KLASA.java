package com.company;

public class KLASA {

    public static void main(String[] args) {

        System.out.println("Hello");
        sayHello("Lara");
        sayGoodBye("Maja");


    }
    private int age =6;

    public static void sayHello(String name){
        System.out.println("Hello " +name);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public KLASA(int age) {
        this.age = age;
    }

    // komentar
    /*
     */
    public static void sayGoodBye(String name){
        // TODO: Add support for multiple users
        System.out.println("Good bye " +name);

}

}
