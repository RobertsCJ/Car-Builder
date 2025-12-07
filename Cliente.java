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
	  carBuild.buildTipo(tipo);
	  carBuild.buildCor(cor);
	  carBuild.buildAno(1990);
	  Carro car = carBuild.make();
	  */
	  int id = 1;
	  Carro car;
	  CarBuilder builder = new CarBuilder();
	  Director dir = new Director(builder);
	  car = dir.buildBMW(id++);
	  car.info();
	  car = dir.buildFord(id++);
	  car.info();
	  car = dir.buildGenericSUV(id++);
	  car.info();
	}

}
