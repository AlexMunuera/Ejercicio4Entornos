import java.util.List;

public class Profesor extends Persona{
    //Primero vamos a cambiar el atributo str por algo que se entienda mejor como "Nombre".
    String Nombre;
    int edad;
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono, String numeroDeTelefono1) {
        super(numeroDeTelefono);
    }

    public void printInformacionPersonal(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Tel�fono: " + numeroDeTelefono);
    }

    public void printTodaLaInformacion(){
        //Aquí hemos refactorizado este método ya que contenía código duplicado, y sin más, llamará al método
        // de arriba, "printinformacionpersonal" para sacar todos los prints.
        this.printInformacionPersonal();
        for (Prestamo p: prestamos) {
            System.out.println(p);
        }
    }

}
