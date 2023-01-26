//Ejercicio Tema8

public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona();
        miPersona.setEdad(45);
        miPersona.getEdad();
        miPersona.setNombre("Luis");
        miPersona.getNombre();
        miPersona.setTelefono(55010203);
        miPersona.getTelefono();
    }
    public static class Persona {
        int edad;
        String nombre;
        long telefono;

        //---
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public int getEdad() {
            System.out.println(edad);
            return edad;
        }
        //---
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            System.out.println(nombre);
            return nombre;
        }
        //---
        public void setTelefono(long telefono) {
            this.telefono = telefono;
        }

        public Number getTelefono() {
            System.out.println(telefono);
            return telefono;
        }
    }

}