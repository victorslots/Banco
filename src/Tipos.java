enum Tipos {
	CORRENTE("Corrente"), POUPANCA("Poupanca");
	
	private String descricao;
	
	Tipos(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
}