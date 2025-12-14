package pack;

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
    Carro toyo = fabrica.buildDetailedToyota(id++);
    toyo.info();
    //toyo.showState();
    //System.out.println(toyo.bateria.isLigado);
    //System.out.println(toyo.motor.isLigado);
    
    
    ControleRemoto remoto = new ControleRemoto();
    Command ligarCarro = new LigarCarroCommand(toyo);
    Command desligarCarro = new DesligarCarroCommand(toyo);
    Command ligarFarol = new FarolOnCommand(toyo.farol);
    Command desligarFarol = new FarolOffCommand(toyo.farol);
    
    remoto.setComando(ligarCarro);
    remoto.comandar();
    toyo.showState();
    
    remoto.setComando(desligarCarro);
    remoto.comandar();
    remoto.setComando(ligarFarol);
    remoto.comandar();
    toyo.showState();
     
	}
}
