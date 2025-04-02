package Banco;


class CuentaCorrienteEmpresa extends CuentaCorriente {
    private static double tipoInteresDescubierto = 5.0;
    private double maximoDescubierto;
    private static double comisionDescubierto = 20.0;

    public CuentaCorrienteEmpresa(Persona titular, double saldo, String entidadesAutorizadas, double maximoDescubierto) {
        super(titular, saldo, entidadesAutorizadas);
        this.maximoDescubierto = maximoDescubierto;
    }

    public void setTipoInteresDescubierto(double nuevoInteres) {
        CuentaCorrienteEmpresa.tipoInteresDescubierto = nuevoInteres;
    }

    @Override
    public String devolverInfoString() {
        return super.devolverInfoString() + ", CCE: Máximo descubierto: " + maximoDescubierto + "€, Comisión por descubierto: " + comisionDescubierto + "€";
    }
}