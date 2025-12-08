public class CarBuilder{
  int id;
  String marca;
  String modelo;
  String tipo;
  String cor;
  int ano;
  
  Motor motor;
  Farol farol;
  Bateria bateria;
  Tanque tanque;
  
  public void reset(){
    id = 0;
    marca = null;
    modelo = null;
    tipo = null;
    cor = null;
    ano = 0;
  }
  
  public void buildId(int id){
    this.id = id;
  }
  public void buildMarca(String marca){
    this.marca = marca;
  }
  public void buildModelo(String modelo){
    this.modelo = modelo;public Carro make(){
    return new Carro(id, marca, modelo, tipo, cor, ano);
  }
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
  
  
  public void buildMotor(int cv, Tanque tq){
    motor = new Motor(tq, cv);
  }
  
  public void buildTanque(int qtd){
    tanque = new Tanque(qtd);
  }
  
  public void buildFarol(String tp){
    farol = new Farol(tp);
  }
  
  
  public void buildBateria(int wt){
    bateria = new Bateria(wt);
  }
  
  public Carro make(){
    return new Carro(id, marca, modelo, tipo, cor, ano);
  }
  public Carro makeDetailed(){
    return new Carro(id, marca, modelo, tipo, cor, ano, motor, farol);
  }

}
