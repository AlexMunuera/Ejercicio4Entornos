public class Persona {
    //No veo nada conveniente cambiar aquí, puesto que con los cambios realizados en profesor ya está el código mucho más entendible.
    protected String numeroDeTelefono;
    public Persona(String numeroDeTelefono){
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
}
