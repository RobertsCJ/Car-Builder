public class FarolOffCommand implements Command{
  Farol farol;

  public void FarolOffCommand(Farol far){
    farol = far;
  }
  public void execute(){
    farol.off();
  }


}
