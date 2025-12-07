public class Carro{
  int id;
  private String marca;
  private String modelo;
  private String tipo;
  private String cor;
  private int ano;
  
  private Motor motor;
  private Bateria bateria;
  private Farol farol;
  
  public Carro(int id, String marca, String modelo, String tipo, String cor, int ano){
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.tipo = tipo;
    this.cor = cor;
  }
  
  public Carro(int id, String marca, String modelo, String tipo, String cor, int ano, Motor mot, Ignicao ign, Farol far){
    this(id, marca, modelo, tipo, cor, ano);
    this.motor = mot;
    this.ignicao = ign;
    this.farol = far;
  }
  public void info(){
    System.out.printf("%s ID %d \n%s %s %d %s\n\n", tipo, id, marca, modelo, ano, cor);
  }
  
  
  
  
  
  
  
  
  
  
  //ficaria com muitos parametros
/*
  Bateria bateria;
  Motor motor;
  Tanque tanque;
  Farol farol;
  Ignicao ignicao
    public Carro(Bateria bateria, Motor motor, Tanque tanque, Farol farol, Ignicao ignicao){
    this.bateria = bateria;
    this.motor = motor;
    this.tanque = tanque;
    this.farol  = farol;
    this.ignicao = ignicao;
  }
  */

}
