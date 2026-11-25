public class PersonalUniversitario {
    protected String nombre, legajo;
    protected int antiguedadAnios;
    public PersonalUniversitario(String nombre, String legajo, int antiguedad) {
        this.nombre = nombre; this.legajo = legajo; antiguedadAnios = antiguedad;
    }
    public double calcularSalario() { return 500000 + antiguedadAnios * 10000; }
    public void mostrarDatos() {
        System.out.println(nombre + " - Legajo: " + legajo + " - Antiguedad: " + antiguedadAnios);
        System.out.println("Salario bruto: $" + calcularSalario());
    }
}