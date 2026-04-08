public class App {
    public static void main(String[] args) throws Exception {

        // Instancia de 3 objetos
        Estudiante p1 = new Estudiante("Juan", "Perez", 19, "Abogacia", 9.00);
        Estudiante p2 = new Estudiante("Marta", "Gomez", 21, "Ingenieria", 8.00);
        Estudiante p3 = new Estudiante();

        //Almacenar en arreglo
        Estudiante[] arrayEstudiantes = { p1, p2, p3 };

        //Mostrar nombre y promedio

        p1.imprimirEstudiante(arrayEstudiantes);

    }

}
