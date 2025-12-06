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
	  Carro car = carBuild.make();
	  */
	  Carro car;
	  CarBuilder builder = new CarBuilder();
	  Director dir = new Director(builder);
	  car = dir.buildBMW(101);
	  car.info();
	  car = dir.buildFord(102);
	  car.info();
	  car = dir.buildSUV(103);
	  car.info();
	}

}
