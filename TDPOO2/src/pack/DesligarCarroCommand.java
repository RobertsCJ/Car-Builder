package pack;

public class DesligarCarroCommand implements Command{
  Carro carro;
  
  public DesligarCarroCommand(Carro car){
    carro = car;
  }
  public void execute(){
    carro.bateria.off();
    carro.motor.off();
  
  }
}
