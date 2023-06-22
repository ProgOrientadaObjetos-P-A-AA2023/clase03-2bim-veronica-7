/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String miCodigo, ArrayList<Estudiante> miLista){
        super(miCodigo);
        lista = miLista;
    }
    
    public void establecerPromedioMatriculas(){
        double suma = 0;
        for(int i=0; i<lista.size(); i++){
            suma = suma + lista.get(i).getMatricula();
        }
        promedioMatriculas = suma/lista.size();
    }
    
    public void establecerLista(ArrayList<Estudiante> miLista){
        lista = miLista;
    }
    
    public ArrayList<Estudiante> obtenerLista(){
        return lista;
    }
    
    public double obtenerPromedioMatriculas(){
        return promedioMatriculas;
    }
    
    @Override
    public String toString(){
        String cadena = "Reporte Estudiante\n";
        cadena = String.format("%sCODIGO%s\n", cadena, codigo);
        cadena = String.format("%sLista estudiantes\n", cadena);
        
        for(int i=0; i<obtenerLista().size(); i++){
            Estudiante e = obtenerLista().get(i);
            cadena = String.format("%sNombre %s\nMatricula: %.2f\n:" , 
                cadena, e.getNombre(), e.getMatricula());
        }
        
        cadena = String.format("%sEl promedio de la matricula es: %.3f\n", 
                cadena, obtenerPromedioMatriculas());
        
        return cadena;
    }
}
