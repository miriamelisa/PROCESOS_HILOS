package Bloqueo_Productor_Consumidor;

import java.util.LinkedList;

public class Deposito {
	 private LinkedList<Integer> buffer = new LinkedList<>();
	    private int capacidad = 5; // Capacidad máxima del depósito

	    public synchronized void producir(int elemento) throws InterruptedException {
	        while (buffer.size() == capacidad) {
	            // El depósito está lleno, el productor espera
	            wait();
	        }
	        
	        buffer.add(elemento);
	        System.out.println("Productor produjo: " + elemento + ", tamaño actual: " + buffer.size());
	        
	        // Notificar a los consumidores que hay elementos disponibles
	        notifyAll();
	    }

	    public synchronized int consumir() throws InterruptedException {
	        while (buffer.isEmpty()) {
	            // El depósito está vacío, el consumidor espera
	            wait();
	        }
	        
	        int elemento = buffer.remove();
	        System.out.println("Consumidor consumió: " + elemento + ", tamaño actual: " + buffer.size());
	        
	        // Notificar al productor que hay espacio disponible
	        notifyAll();
	        
	        return elemento;
	    }
	}