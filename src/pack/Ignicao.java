package pack;

public class Ignicao{
  Bateria bateria;
  
  public Ignicao(Bateria bat){
    bateria = bat;
  }
  
  public void on(){
    isLigado = true;
  }
  public void off(){
    isLigado = false;
  }
}
