public class CarBuilder{
  int id;
  String marca;
  String modelo;
  String tipo;
  String cor;
  int ano;
  
  public void reset(){
    //
  } 
  
  public void buildId(int id){
    this.id = id;
  }
  public void buildMarca(String marca){
    this.marca = marca;
  }
  public void buildModelo(String modelo){
    this.modelo = modelo;
  }
  public void buildTipo(String tipo){
    this.tipo = tipo;
  }
  public void buildCor(String cor){
    this.cor = cor;
  }
  
  public void buildAno(int ano){
    this.ano = ano;
  }
  public Carro make(){
    return new Carro(id, marca, modelo, tipo, cor, ano);
  }

}
