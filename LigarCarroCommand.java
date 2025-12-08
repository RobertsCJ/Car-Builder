public class LigarCarroCommand implements Command{
  Carro carro;
  
  public LigarCarroCommand(Carro car){
    carro = car;
  }
  public void execute(){
    carro.ligar();
  
  }
}
