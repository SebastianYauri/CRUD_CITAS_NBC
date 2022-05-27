
package Modelo;

public class Persona {
    int id;
    String dni;
    String nom;
    String ape;
    int tlf;

    public Persona() {
    }


    public Persona(String dni, String nom, String ape, int tlf) {
        this.dni = dni;
        this.nom = nom;
        this.ape = ape;
        this.tlf = tlf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }


    
}
