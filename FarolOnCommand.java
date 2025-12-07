public class FarolOnCommand implements Command{
  Farol farol;
  
  public FarolOnCommand(Farol far){
    farol = far;
  }
  public void execute(){
    farol.on();
  }
    
}
