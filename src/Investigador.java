public class Investigador extends PersonalUniversitario {
    private int papersPublicados;
    private double subsidioAsignado;
    public Investigador(String nombre, String legajo, int antiguedad, int papers, double subsidio) {
        super(nombre, legajo, antiguedad); papersPublicados = papers; subsidioAsignado = subsidio;
    }
    @Override
    public double calcularSalario() { return super.calcularSalario() + papersPublicados * 15000 + subsidioAsignado; }
}