class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		Data dataEntrada = new Data();
		
		f1.setNome("Hugo");
		f1.setSalario(100);
		f1.recebeAumento(50);
		
		dataEntrada.preencheData(20,1,1989);
		
		f1.setDataEntrada(dataEntrada);
		
		System.out.println("salario atual:" + f1.getSalario());
		System.out.println("ganho anual:" + f1.calculaGanhoAnual());
		//f1.mostra();
		System.out.println(f1.getIdentificador());
		System.out.println(f2.getIdentificador());
		System.out.println(f3.getIdentificador());
	}
}