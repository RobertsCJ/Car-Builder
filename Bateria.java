public class Bateria{
  boolean isLigado;
  String tipo;
  int watts;
  
  public Bateria(String tipo, int watts){
    this.tipo = tipo;
    this.watts = watts;
  }
  
  public Bateria(int watts){
    this.watts = watts;
  }
  
  public void on(){
    isLigado = true;
  }
  public void off(){
    isLigado = false;
  }
}
