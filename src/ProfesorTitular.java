public class ProfesorTitular extends PersonalUniversitario {
    private int horasFrenteAlumnos;
    private String categoriaDocencia;
    public ProfesorTitular(String nombre, String legajo, int antiguedad, int horas, String categoria) {
        super(nombre, legajo, antiguedad); horasFrenteAlumnos = horas; categoriaDocencia = categoria;
    }
    @Override
    public double calcularSalario() { return super.calcularSalario() + horasFrenteAlumnos * 8000; }
}