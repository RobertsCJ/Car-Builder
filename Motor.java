public class Motor{
  Tanque tanque;
  int cv;
  boolean isLigado;
  String tipo;
  
  public Motor(Tanque tq, int cv){
    tanque = tq;
    this.cv = cv;
  }
  
  public Motor(Tanque tq, int cv, String tp){
    tanque = tq;
    this.cv = cv;
    tipo = tp;
    
  }
  
  public void on(){
    isLigado = true;
  }
  public void off(){
    isLigado = false;
  }
  
}
