package com.company.magicInterface.Animals;

public class Account {
    int saldo;
    int oborot;



    private Account(int saldo, int oborot) {
        this.saldo = saldo;
        this.oborot = oborot;
    }

    static Account createRevolverAccount(){
      Account resuAccount=new Account(300000,0);

        return  resuAccount;
    };
}
