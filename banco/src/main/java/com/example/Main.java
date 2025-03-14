package com.example;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.setTitular("Juanito Alcachofa");
        cuenta1.depositar(100.0);
    
    CuentaBancaria cuenta2 = new CuentaBancaria("1234",500.0,"Maria Guiller");
    cuenta2.depositar(200.0);
    cuenta2.retirar(800.0);

    System.out.println("Cuenta 1:"+ cuenta1.getNumeroCuenta() + ","+ cuenta1.getTitular() +","+ cuenta1.getSaldo());
    System.out.println("Cuenta 2:"+ cuenta2.getNumeroCuenta() + ","+ cuenta2.getTitular() +","+ cuenta2.getSaldo());



    }


}