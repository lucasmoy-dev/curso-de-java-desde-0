public enum EstadoPaquete {
    SMALL_ENVIADO(true),
    SMALL_PERDIDO(true),
    SMALL_DEVOLUCION(true),
    SMALL_CANCELADO(true),
    SMALL_EN_TRANSITO(true),
    BIG_ENVIADO(false),
    BIG_PERDIDO(false),
    BIG_DEVOLUCION(false),
    BIG_CANCELADO(false),
    BIG_EN_TRANSITO(false);

    EstadoPaquete(boolean esPequeno) {
        this.esPequeno = esPequeno;
    }

    private boolean esPequeno;

    public boolean esPequeno() {
        return esPequeno;
    }
}
