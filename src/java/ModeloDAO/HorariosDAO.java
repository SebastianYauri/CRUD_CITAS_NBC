/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUDHorarios;
import Modelo.Horarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franklin
 */
public class HorariosDAO implements CRUDHorarios {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Horarios h=new Horarios();
    
    @Override
    public List listar() {
        ArrayList<Horarios>list=new ArrayList<>();
        String sql="select * from detallehorarios";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Horarios hor=new Horarios();
                hor.setId(rs.getInt("IDHorario"));
                hor.setNom(rs.getString("Nombres"));
                hor.setApe(rs.getString("Apellidos"));
                hor.setFecha(rs.getDate("Fecha"));
                hor.setHora(rs.getTime("Hora"));
                list.add(hor);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    @Override
    public Horarios list(int id) {
        String sql="select * from detallehorarios where IDHorario="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                h.setId(rs.getInt("IDHorario"));
                h.setNom(rs.getString("Nombres"));
                h.setApe(rs.getString("Apellidos"));
                h.setFecha(rs.getDate("Fecha"));
                h.setHora(rs.getTime("Hora"));
                
            }
        } catch (SQLException e) {
        }
        return h;
        
    }

    @Override
    public boolean add(Horarios hor) {
        String sql="insert into detallehorarios(Nombres, Apellidos, Fecha, Hora)values('"+hor.getNom()+"','"+hor.getApe()+"','"+hor.getFecha()+"','"+hor.getHora()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
       return false;
        
    }

    @Override
    public boolean edit(Horarios hor) {
        String sql="update detallehorarios set Nombres='"+hor.getNom()+"',Apellidos='"+hor.getApe()+"',Fecha='"+hor.getFecha()+"',Hora='"+hor.getHora()+"'where IDHorario="+hor.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return false;
        
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from detallehorarios where IDHorario="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return false;
    }

    
}
