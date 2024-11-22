package org.example;

public class PuntosFidelidad {
    private int puntos;
    private Cliente cliente;


    public PuntosFidelidad(Cliente cliente) {
        this.cliente = cliente;
        this.puntos = 0;
    }

    // Método para asignar puntos al cliente por una compra realizada.
    public void asignarPuntos(double montoCompra) {

        int puntosGanados = (int) montoCompra / 10;
        puntos += puntosGanados;

        System.out.println("Se han asignado " + puntosGanados + " puntos por una compra de " + montoCompra + " unidades.");
    }

    // Método para canjear puntos por descuentos.
    public boolean canjearPuntos(int puntosRequeridos) {
        if (puntos >= puntosRequeridos) {
            puntos -= puntosRequeridos;
            System.out.println("Puntos canjeados: " + puntosRequeridos + ". Puntos restantes: " + puntos);
            return true;  // Canje exitoso
        } else {
            System.out.println("No tienes suficientes puntos para canjear.");
            return false;  // No tiene suficientes puntos
        }
    }

    // Método para obtener los puntos actuales.
    public int getPuntos() {
        return puntos;
    }

    // Método para mostrar el saldo de puntos.
    public void mostrarSaldo() {
        System.out.println("Saldo actual de puntos para el cliente " + cliente.getNombre() + ": " + puntos);
    }
}
