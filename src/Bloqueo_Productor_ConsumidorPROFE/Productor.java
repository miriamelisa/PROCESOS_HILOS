package Bloqueo_Productor_ConsumidorPROFE;

public class Productor extends Thread {
    private Deposito deposito;

    public Productor(Deposito deposito) {
        this.deposito = deposito;
    }

    public void run() {
   
            for (int i = 0; i <20; i++) {
                deposito.agregar();
                try {
                Thread.sleep(100); // Simular tiempo de producción
            }
         catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}