package edu.elsmancs;

public class DNI {

    private String dni;
    private TablaAsignacion tabla = new TablaAsignacion();

    public void Dni(String dni) {

        this.dni = dni;
    }

    private String getDni() {

        return this.dni;
    }
    @Override
    public String toString() {
        return getDni();
    }

    Boolean isDniNumero(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) {
                return false;
            } else
                ;
        }
        return true;
    }
    String extraerParteNumericaDni() {

        return (String) dni.substring(0, dni.length() - 1);
    }
}
