/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.i.datos.ii;

/**
 *
 * @author ofortich
 */
public class Nodo {
    
    Boolean Paquete;//si es un paquete va a ser verdadero
    private String nombre;
    private String data;
    private Nodo rLink;
    private Nodo lLink;

    public Nodo(String nombre) {
        this.nombre = nombre;
    }
    /*
    void add(int i) {
        Nodo temp=this,ant=null;
        while(temp!=null){
            if(temp.data==i)break;
            else if(i>temp.data){
                ant=temp;
                temp=temp.Rlink;
            }else{
                ant=temp;
                temp=temp.Llink;
            }
        }
        if(temp==null){//no esta repetido
            if(i>ant.data) ant.rLink= new Nodo(i);
            else ant.Llink= new Nodo(i);
        }
    }
    */
    void add(String nombre, Boolean paquete){
        if (paquete) {
            this.ultPaquete().lLink=new Nodo(nombre);
        }else{
            
        }
        
    }
    private Nodo ultPaquete(){
        Nodo p=this;
        while(p.lLink != null){
            p=p.lLink;
        }
        return p;
    }
    
}
