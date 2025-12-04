public class CarBuilder{
  int id;
  String marca;
  String modelo;
  String tipo;
  String cor;
  
  public void id(){
    this.id = id;
  }
  
  public Carro build(){
    return new Carro(id, marca, modelo, tipo, cor);
  }

}
