package Bloqueo_Productor_Consumidor;

class Consumidor extends Thread {
    private Deposito deposito;

    public Consumidor(Deposito deposito) {
        this.deposito = deposito;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                int elemento = deposito.consumir();
                Thread.sleep(200); // Simular tiempo de consumo
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

