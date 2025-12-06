public class Director{
  CarBuilder builder;
  //Classe Diretor serve como uma espécie de Facade
  //Muitos carros iguais sao produzidos na Fabrica, entao a usamos para simplificar
  public Director(CarBuilder builder){
    this.builder = builder;
  }
  
  public Carro buildSUV(int id){
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
     builder.buildTipo("Sedan");
     builder.buildCor("Preto");
     return builder.make();
  }
  
  

}
