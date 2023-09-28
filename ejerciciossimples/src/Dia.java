public enum Dia {
    LUNES(false),
    MARTES(false),
    MIERCOLES(false),
    JUEVES(false),
    VIERNES(false),
    SABADO(true),
    DOMINGO(true);

    private boolean esFinDeSemana;

    Dia(boolean esFinDeSemana) {
        this.esFinDeSemana = esFinDeSemana;
    }

    public boolean getEsFinDeSemana() {
        return esFinDeSemana;
    }
}
