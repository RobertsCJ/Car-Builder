public class Director{
  CarBuilder builder;
  //Classe Diretor serve como uma espécie de Facade
  //Muitos carros iguais sao produzidos na Fabrica, entao a usamos para simplificar
  public Director(CarBuilder builder){
    this.builder = builder;
  }
  
  public Carro buildGenericSUV(int id){
    builder.reset();
    builder.buildId(id);
    builder.buildTipo("SUV");
    return builder.make();
  }
  public Carro buildBMW(int id){
    builder.reset();
    builder.buildId(id);
    builder.buildMarca("BMW");
    builder.buildModelo("Z3");
    builder.buildAno(2020);
    builder.buildCor("Vermelho");
    builder.buildTipo("Sportcar");
    return builder.make();
  } 
  public Carro buildFord(int id){
     builder.reset();
     builder.buildId(id);
     builder.buildMarca("Ford");
     builder.buildModelo("KA");
     builder.buildAno(2018);
  
  public Carro buildFord(int id){
     builder.reset();
     builder.buildId(id);
     builder.buildMarca("Ford");
     builder.buildModelo("KA");
     builder.buildAno(2018);
     builder.buildTipo("Sedan");
     builder.buildCor("Preto");
     return builder.make();
  }
  
  public Carro buildDetailedToyota(int id){
    builder.reset();
    builder.buildId(id);
     builder.buildMarca("Toyota");
     builder.buildModelo("Supra");
     builder.buildAno(1997);
     builder.buildTipo("Coupé");
     builder.buildCor("Laranja");
     builder.buildFarol("Xenon");
     builder.buildTanque(60);
     builder.buildMotor(360, builder.tanque);
     builder.buildBateria(40000);
     builder.makeDetailed;
  }
  
  public Carro buildYourOwnCar(int id, String marca, String modelo, int ano, String tipo, String cor){
    builder.reset();
    builder.buildId(id);
     builder.buildMarca(marca);
     builder.buildModelo(modelo);
     builder.buildAno(ano);
     builder.buildTipo(tipo);
     builder.buildCor(cor);
     builder.make();
  }
  
  public Carro buildYourOwnCarDetailed(int id, String marca, String modelo, int   ano, String tipo, String cor, Motor motor, Farol far){
    builder.reset();
    builder.buildId(id);
     builder.buildMarca(marca);
     builder.buildModelo(modelo);
     builder.buildAno(ano);
     builder.buildTipo(tipo);
     builder.buildCor(cor);
  }
  
  

}
