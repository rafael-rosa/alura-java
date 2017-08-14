class Fatorial{
	public static void main(String[] args)	{
		
		int maxFatorial = 80;
		int iniFatorial = 1;
		int i = 0;
		long valorFatorial = 1;
		
		for(i=iniFatorial;i<=maxFatorial;i++){
			
			valorFatorial = valorFatorial * i;
			
			System.out.println("Fatorial de " + i + " é:" + valorFatorial);
		}
		
	}
}