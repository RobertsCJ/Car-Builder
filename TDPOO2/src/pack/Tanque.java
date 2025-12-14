package pack;

public class Tanque{
  int qtd;
  int max;
  
  public Tanque(int max){
    this.max = max;
  }
  public void encher(int qtd){
    if (max >= this.qtd+qtd){
      this.qtd+=qtd;
    } else {
      this.qtd = max;
    }
  }
  
}
