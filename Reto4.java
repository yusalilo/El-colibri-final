/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto4;
Nicolas PrO
//NO ELIMINAR ESTA IMPORTACIÓN. SE REQUIERE
//PARA LA EJECUCIÓN DEL MÉTODO generarCredenciales()
import java.util.Random;


public class UsuarioMoodle { 
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    //Y SU MÉTODO CONSTRUCTOR
  String idTiquete;
  String nombreCompleto;
  String direccionResidencia;
  String credenciales;
  
  public Asistente(String idTiquete, String nombreCompleto, String direccionResidencia){
       this.idTiquete = idTiquete;
       this.nombreCompleto = nombreCompleto;
       this.direccionResidencia = direccionResidencia;
       this.credenciales = "";
      }
        
    

    //NO DEBE PREOCUPARSE POR LA ESCRITURA DEL
    //MÉTODO A CONTINUACIÓN. ESTE REQUIERE DE LA 
    //IMPORTACIÓN DE LA LIBRERÍA Random PARA SU 
    //FUNCIONAMIENTO
    public void generarCredenciales() {
        if(credenciales.isEmpty()){ 
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencial = String.valueOf(x);
            credenciales = credencial;
        }
    }
    
    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    //SETTER DEL CASO
    public String getIdTiquete() {
        return idTiquete;
    }

    public void setIdTiquete(String idTiquete) {
        this.idTiquete = idTiquete;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }
}
[0:48 p. m., 31/7/2022] Nicolas ECCI: public class Preferencial extends Asistente {
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    //Y SU MÉTODO CONSTRUCTOR
   boolean participaSorteo;// se crea la variable boolean con minuscula porque sino lo reconoceria como un dato no promitivo.

    
    public Preferencial (String idTiquete, String nombreCompleto, String direccionResidencia){
    super(idTiquete, nombreCompleto, direccionResidencia);
    }

    
        //ESPACIO PARA ESCRIBIR LA LÓGICA DEL MÉTODO
        //participarSorteo()
    public void participarSorteo(){
        if(isParticipaSorteo()){
        this.participaSorteo = false;
            }
        else{
        this.participaSorteo = true;
            }
    }
        

      
    
    
    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    //SETTER DEL CASO
    public boolean isParticipaSorteo() {
        return participaSorteo;
    }

    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }
    
}
