/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complejos;

/**
 *
 * @author Horacio Galdamez
 */
public class comple {
    
    private String A;
    private String B;
   
    private String A2;
    private String B2;
   
    public comple(){
        A="";
        B="";
        
        A2="";
        B2="";
    }
    
    public comple(String parteReal1, String parteReal2,String B, String B2){
      
        this.A=parteReal1;
        this.A2=parteReal2;
        this.B=B;
        this.B2=B2;
        
        
    }
    
    public void setA (String parteReal1){
        this.A=parteReal1;
    }
    
    public void setB (String B){
        this.B=B;
    }
    
    public void setA2 (String parteReal2){
        this.A2=parteReal2;
    }
    
    public void setB2 (String B2){
        this.B2=B2;
    }
    
    public String getA (){
       return this.A;
    }
    
     public String getA2 (){
       return this.A2;
    }
    
      public String getB (){
       return this.B;
    }
      
       public String getB2 (){
       return this.B2;
    }
       
       
       public String suma(){
           int a=Integer.parseInt(A);
           int a2=Integer.parseInt(A2);
           
           int b=Integer.parseInt(B);
           int b2=Integer.parseInt(B2);
           
           return ((a+a2)+"+"+(b+b2))+"i";
       }
       
       public String resta(){
           int a=Integer.parseInt(A);
           int a2=Integer.parseInt(A2);
           
           int b=Integer.parseInt(B);
           int b2=Integer.parseInt(B2);
           
           return ((a+a2)+"-"+(b+b2))+"i";
       }
       
       public String multiplicacion(){
           int a=Integer.parseInt(A);
           int a2=Integer.parseInt(A2);
           
           int b=Integer.parseInt(B);
           int b2=Integer.parseInt(B2);
           
           return (((a*a2)-(b*b2))+"-"+((a*b2)-(a2*b)))+"i";
       }
       
       @Override
       public String toString(){
           return "Suma de complejos: "+suma()+"\nResta de Complejos: "+resta()+"\nProducto de Complejos: "+multiplicacion();
       }//fin metodo toString sobreescrito
       
}//fin clase
