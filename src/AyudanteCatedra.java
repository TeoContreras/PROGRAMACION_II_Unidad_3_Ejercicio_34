public class AyudanteCatedra extends PersonalUniversitario {
    private int practicasAsignadas;
    public AyudanteCatedra(String nombre, String legajo, int antiguedad, int practicas) {
        super(nombre, legajo, antiguedad); practicasAsignadas = practicas;
    }
    @Override
    public double calcularSalario() { return super.calcularSalario() + practicasAsignadas * 5000; }
}