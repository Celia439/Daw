package Banco;

class CuentaAhorro extends CuentaBancaria {
    private static double tipoInteres = 1.5;

    public CuentaAhorro(Persona titular, double saldo) {
        super(titular, saldo);
    }

    public static void setTipoInteres(double nuevoInteres) {
        tipoInteres = nuevoInteres;
    }

    public static double getTipoInteres() {
        return tipoInteres;
    }

    @Override
    public String devolverInfoString() {
        return super.devolverInfoString() + ", CA: Tipo de Interés: " + tipoInteres + "%";
    }
}