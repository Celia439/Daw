package Banco;


class CuentaCorrientePersonal extends CuentaCorriente {
    private static double comisionMantenimiento = 10.0;

    public CuentaCorrientePersonal(Persona titular, double saldo, String entidadesAutorizadas) {
        super(titular, saldo, entidadesAutorizadas);
    }

    public static void setComisionMantenimiento(double nuevaComision) {
        comisionMantenimiento = nuevaComision;
    }

    @Override
    public String devolverInfoString() {
        return super.devolverInfoString() + ", CCP: Comisión de mantenimiento: " + comisionMantenimiento + "€";
    }
}