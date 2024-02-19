package Bloqueo_Productor_Consumidor;

class Productor extends Thread {
    private Deposito deposito;

    public Productor(Deposito deposito) {
        this.deposito = deposito;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                deposito.producir(i);
                Thread.sleep(100); // Simular tiempo de producción
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}