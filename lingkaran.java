package program01;
import java.io.*;
public class lingkaran {
    protected double radius;
 public lingkaran(double radius){
     this.radius=radius;
 }  
  public void Luas(){ 
      double luas = 3.14*radius*radius;
      System.out.println("Luas lingkaran: "+luas);
  }
    
  public void Keliling(){ 
      double keliling = 3.14*radius*radius;
      System.out.println("Keliling lingkaran: "+keliling);
  }  
    
    public static void main(String[] args)throws Exception {
       DataInputStream dis= new DataInputStream(System.in);
       System.out.print("input radius: ");
       String input = dis.readLine();
       double i= Double.parseDouble(input);
      lingkaran A = new lingkaran(i);
      A.Luas();
      A.Keliling();
    }
    
}
