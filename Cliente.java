public class Cliente{
	public static void main(String[] args){
	  //Carro car = new Carro(new Bateria(), new Motor(), new Tanque(), new Farol()); fica com muitos parametros
	  int id = 101;
	  /*
	  String cor = "Vermelho";
	  String marca = "BMW";
	  String modelo = "M3";
	  String tipo = "Sportcar";
	  CarBuilder carBuild = new CarBuilder();
	  carBuild.buildId(id);
	  carBuild.buildMarca(marca);
	  carBuild.buildModelo(modelo);
	  carBuild.buildTipo(tipo);
	  carBuild.buildCor(cor);
	  carBuild.buildAno(1990);
	  Carro car = carBuild.build();
	  */
	  Director dir = new Director(new CarBuilder());
	  Carro car = dir.buildBMW(101);
	  
	  
	  
	  car.info();
	}

}
