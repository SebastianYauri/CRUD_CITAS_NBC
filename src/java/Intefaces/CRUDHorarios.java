
package Intefaces;

import Modelo.Horarios;
import java.util.List;


public interface CRUDHorarios {
    public List listar();
    public Horarios list(int id);
    public boolean add(Horarios hor);
    public boolean edit(Horarios hor);
    public boolean eliminar(int id);
    
}
