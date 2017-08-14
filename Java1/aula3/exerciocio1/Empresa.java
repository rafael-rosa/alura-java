class Empresa{
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;
	private int membro = 0;
	
	public Empresa(int quantidadeFuncionarios){
		this.funcionarios = new Funcionario[quantidadeFuncionarios];
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	
	public String getCnpj(){
		return this.cnpj;
	}
	
	public Funcionario getFuncionario(int posicao){
		return this.funcionarios[posicao];
	}
	
	void adiciona (Funcionario f){
		if(this.funcionarios == null)
			this.funcionarios = new Funcionario[10];
		
		 funcionarios[this.membro] = f;
		 this.membro++;
	}
	
	void mostraEmpregados(){
		for(Funcionario f : funcionarios){
			if(f != null)
				f.mostra();			
		}
	}
	
	boolean contem(Funcionario func){
		for(Funcionario f : this.funcionarios){
			if(f != null){
				if(f == func)
					return true;
			}
		}
		return false;
	}
}