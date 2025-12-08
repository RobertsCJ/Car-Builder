class ControleRemoto{
	Command tipoComando;
	
	public void setComando(Command tipoComando){
	  this.tipoComando = tipoComando;
	}
	public void comandar(){
		tipoComando.execute();
	}
	
}
