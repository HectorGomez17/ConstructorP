package perro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hector Gomez Tapia
 */
public abstract class perrito {
    String sexo;
    int color;
    int peso;
    double tamaño;
    String piel;
    
    public abstract void IMC();
    public abstract void respirar();
    public abstract void caminar();
    public abstract void hablar();
    
    perrito(String sexo, int edad, int peso, double estatura, String piel){
    this.sexo=sexo;
    this.color= color;
    this.peso=peso;
    this.tamaño=tamaño;
    this.piel=piel;
   
    
    }
    
}
