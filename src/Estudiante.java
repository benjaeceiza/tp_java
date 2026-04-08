public class Estudiante {

    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, String carrera, double promedio) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
 
    
    //Imprime el nombre y el promedio de cada estudiante del arreglo
    public void imprimirEstudiante (Estudiante [] arrayEstudiantes) {

        for (int i = 0; i < arrayEstudiantes.length; i++) {
            System.out.println("Nombre: " + nombre + " " + "Promedio: " + promedio);
        }
    }

}
