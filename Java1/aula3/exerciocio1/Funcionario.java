class Funcionario{
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	private int identificador = 0;
	private static int incremental = 1;
	
	public Funcionario(){
		this.identificador = incremental;
		incremental++;
	}
	
	public Funcionario(String nome){
		this.nome = nome;
	}
	
	public int getIdentificador(){
		return this.identificador;
	}
	
	public void setNome(String nome){
		this.nome = nome;		
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;		
	}
	
	public String getDepartamento(){
		return this.departamento;
	}

	public void setSalario(double salario){
		this.salario = salario;		
	}
	
	public double getSalario(){
		return this.salario;
	}

	public void setRg(String rg){
		this.rg = rg;		
	}
	
	public String getRg(){
		return this.rg;
	}
	
	public void setDataEntrada(Data dataEntrada){
		this.dataEntrada = dataEntrada;		
	}
	
	public Data getDataEntrada(){
		return this.dataEntrada;
	}
	
	public void recebeAumento(double valorAumento){
		this.salario += valorAumento;
	}
	
	public double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	public void mostra(){
		System.out.println("Nome:"+this.nome);
		System.out.println("departamento:"+this.departamento);
		System.out.println("salario:"+this.salario);
		System.out.println("data de entrada:"+this.dataEntrada.mostra());
		System.out.println("rg:"+this.rg);
		System.out.println("ganho anual:"+this.calculaGanhoAnual());
	}
}