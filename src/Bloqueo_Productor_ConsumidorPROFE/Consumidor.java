package Bloqueo_Productor_ConsumidorPROFE;

public class Consumidor extends Thread {
    private Deposito deposito;

    public Consumidor(Deposito deposito) {
        this.deposito = deposito;
    }

    public void run() {
       
            for (int i=0; i <10; i++) {
                deposito.retirar();
                try {
                Thread.sleep(300); // Simular tiempo de consumo
   
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}