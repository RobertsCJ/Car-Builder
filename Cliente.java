public class Cliente{
	public static void main(String[] args){
	  //Carro car = new Carro(new Bateria(), new Motor(), new Tanque(), new Farol()); fica com muitos parametros
	  /*
	  String cor = "Vermelho";
	  String marca = "BMW";
	  String modelo = "M3";
	  String tipo = "Sportcar";
	  CarBuilder carBuild = new CarBuilder();
	  carBuild.buildId(id);
	  carBuild.buildMarca(marca);
	  carBuild.buildModelo(modelo);
  */
    int id = 1;
    
    CarBuilder builder = new CarBuilder();
    Director fabrica = new Director(builder);
    
	}
}
