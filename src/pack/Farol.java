package pack;

public class Farol{
  boolean isLigado;
  String tipo;
  String estado;
  
  public Farol(String tp){
    tipo = tp;
  }
  
  
 public void on(){
    isLigado = true;
  }
  public void off(){
    isLigado = false;
  }
}
