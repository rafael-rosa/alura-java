class TestaEmpresa{
	public static void main(String[] args){
		Empresa empresa = new Empresa(5);
		
		for(int i=0; i < 5; i++){
			Funcionario f = new Funcionario();
			f.setSalario(i*55.5);
			Data dataEntrada = new Data();
			dataEntrada.preencheData(1,1,2015);
			
			f.setDataEntrada(dataEntrada);
			
			empresa.adiciona(f);
		}
		/*System.out.println(empresa.membro);
		System.out.println(empresa.funcionarios[4].salario);*/
		empresa.mostraEmpregados();
	}
}