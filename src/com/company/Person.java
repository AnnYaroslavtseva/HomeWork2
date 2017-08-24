package com.company;


public abstract class Person {
    private String name;
    private String surname;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public abstract void displayInfo();
}

class Employee extends Person{

    private String bank;

    public Employee(String name, String surname, String company) {

        super(name, surname);
        this.bank=company;
    }

    public void displayInfo(){

        System.out.println("Имя: " + super.getName() + " Фамилия: "
                + super.getSurname() + " Работает в банке: " + bank);
    }
}

class Client extends Person
{
    private String bank;

    public Client(String name, String surname, String company) {

        super(name, surname);
        this.bank=company;
    }

    public void displayInfo(){

        System.out.println("Имя: " + super.getName() + " Фамилия: "
                + super.getSurname() + " Клиент банка: " + bank);
    }
}
