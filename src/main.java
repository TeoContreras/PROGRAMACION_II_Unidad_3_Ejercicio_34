public class main {
    public static void main(String[] args) {
        PersonalUniversitario[] personal = new PersonalUniversitario[3];
        personal[0] = new ProfesorTitular("Laura", "P01", 10, 20, "Titular");
        personal[1] = new Investigador("Carlos", "I02", 8, 12, 200000);
        personal[2] = new AyudanteCatedra("Sofia", "A03", 2, 6);
        for (int i = 0; i < personal.length; i++) personal[i].mostrarDatos();
    }
}