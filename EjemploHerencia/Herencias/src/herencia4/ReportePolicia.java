/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;
    
    public ReportePolicia(String miCodigo, ArrayList<Policia> miLista){
        super(miCodigo);
        lista = miLista;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(int i=0; i<lista.size(); i++){
            suma = suma + lista.get(i).getEdad();
        }
        promedioEdades = suma/lista.size();
    }
    
    public void establecerLista(ArrayList<Policia> miLista){
        lista = miLista;
    }
    
    public ArrayList<Policia> obtenerLista(){
        return lista;
    }
    
    public double obtenerPromedioEdades(){
        return promedioEdades;
    }
    
    @Override
    public String toString(){
        String cadena = "Reporte Policia\n";
        cadena = String.format("%sCODIGO%s\n", cadena, codigo);
        cadena = String.format("%sLista Policias\n", cadena);
        
        for(int i=0; i<obtenerLista().size(); i++){
            Policia p = obtenerLista().get(i);
            cadena = String.format("%sNombre: %s\nEdad: %d\nRango: %s" , 
                cadena, p.getNombre(), p.getEdad(),p.getRango());
        }
        
        cadena = String.format("%sEl promedio de las edades es: %.3f\n", 
                cadena, obtenerPromedioEdades());
        
        return cadena;
    }
}
