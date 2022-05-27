
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements CRUD{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p=new Persona();
    
    @Override
    public List listar() {
        ArrayList<Persona>list=new ArrayList<>();
        String sql="select * from tb_cliente";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Persona per=new Persona();
                per.setId(rs.getInt("IDCli"));
                per.setDni(rs.getString("Dni"));
                per.setNom(rs.getString("Nombres"));
                per.setApe(rs.getString("Apellidos"));
                per.setTlf(rs.getInt("Celular"));
                list.add(per);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Persona list(int id) {
        String sql="select * from tb_cliente where IDCli="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                p.setId(rs.getInt("IDCli"));
                p.setDni(rs.getString("Dni"));
                p.setNom(rs.getString("Nombres"));
                p.setApe(rs.getString("Apellidos"));
                p.setTlf(rs.getInt("Celular"));
                
            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean add(Persona per) {
       String sql="insert into tb_cliente(Dni, Nombres, Apellidos, Celular)values('"+per.getDni()+"','"+per.getNom()+"','"+per.getApe()+"','"+per.getTlf()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Persona per) {
        String sql="update tb_cliente set Dni='"+per.getDni()+"',Nombres='"+per.getNom()+"',Apellidos='"+per.getApe()+"',Celular='"+per.getTlf()+"'where IDCli="+per.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from tb_cliente where IDCli="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
    @Override
    public List buscar(String texto){
        List<Persona> lista=new ArrayList<>();
        String sql;
        sql="select * from tb_cliente where IDCli like '%"+texto+"%' or Nombres like '%"+texto+"%' or Apellidos like '%"+texto+"%' or Dni like '%"+texto+"%' or Celular like '%"+texto+"%'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                Persona per=new Persona();
                per.setDni(rs.getString("Dni"));
                per.setNom(rs.getString("Nombres"));
                per.setApe(rs.getString("Apellidos"));
                per.setTlf(rs.getInt("Celular"));
                lista.add(per);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    
    
}
