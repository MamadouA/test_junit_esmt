package net.esmtaql;

public class Factorielle {

    public int factorielle(int nombre){

        int factorielle = 1;

        for(int i = 1; i <= nombre; i++){
            factorielle = factorielle * i;
        }

        return factorielle;
    }
}
