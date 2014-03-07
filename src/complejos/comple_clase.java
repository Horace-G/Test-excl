/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complejos;

/**
 *
 * @author Horacio Galdamez
 */
public class comple_clase {
    
    private double real;
    private String signo;
    private double imaginarioReal;
    private String imaginarioCons;
    
    
    public comple_clase(){
        
        
    }
        
    public comple_clase (double real, String signo, double imaginarioReal, String imaginarioCons){
        this.real=real;
        this.signo=signo;
        this.imaginarioReal=imaginarioReal;
        this.imaginarioCons=imaginarioCons;
    }
    
    //((objeto)lista.get(0)).  esto es para castearlo y que salga el objeto y no la referencia
    
    //mejor llamar lista.add(new objeto()); esta es la mejor de todas las formas
    
    //otra forma de crear arreglos de objetos
    
    //objeto [] arreglo=new objeto[5];
    /*for (int i=0;i<arreglo.length;i++)
     * arreglo[i]=new objeto();
     */
   
    //mutadores
    public void setReal(double real){
        this.real=real;
    }
    
    public double getReal(){
        return this.real;
    }
    
    public void setSigno(String signo){
        this.signo=signo;
    }
    
    public String getSigno(){
        return this.signo;
    }
    
    public void setImaginarioReal(double imaginarioReal){
        this.imaginarioReal=imaginarioReal;
    }
    
    public double getImaginario(){
        return this.imaginarioReal;
    }
    
    //el que viene de argumento mas el que esta almacenado en el objeto
    public void setimaginarioCons(String imaginarioCons){
        this.imaginarioCons=imaginarioCons;
    }
    
    public String getimaginarioCons(){
        return this.imaginarioCons=imaginarioCons;
    }
    
    
    /*
     * en el main:**********************
     * 
     * m.suma(x,y);
     * 
     */
    
    public comple_clase suma(comple_clase x,comple_clase y){
       //(a+bi)+(c+di)=(a+c)+(b+d)i
        double temp1=x.getReal()+y.getReal();
        double temp2=x.getImaginario()+y.getImaginario();
        
        return new comple_clase(temp1,"+",temp2,"i");
   
    }//fin metodo

     public comple_clase multi(comple_clase x,comple_clase y){
       //(a+bi)*(c+di)=(ac-bd)+(ad+bc)i
        double temp1=((x.getReal()*y.getReal())-(x.getImaginario()*y.getImaginario()));
        double temp2=((x.getReal()*y.getImaginario()+x.getImaginario()*y.getReal()));
        
        return new comple_clase(temp1,"+",temp2,"i");
   
    }//fin metodo

     @Override 
     public String toString(){
         return ""+this.real+""+this.signo+""+this.imaginarioReal+this.imaginarioCons;
     }

}//fin clase
