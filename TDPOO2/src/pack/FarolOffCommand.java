package pack;

public class FarolOffCommand implements Command{
  Farol farol;

  public FarolOffCommand(Farol far){
    farol = far;
  }
  public void execute(){
    farol.off();
  }


}
