package rosa.silva.rafael;

import rosa.silva.rafael.propriedades.ManipulaPropriedades;

public class ProgramaLerPropsComThread {
	public static void main(String[] args) {
		
			ManipulaPropriedades propsServer = new ManipulaPropriedades("./properties/serverProperties.txt");
			ManipulaPropriedades propsClient = new ManipulaPropriedades("./properties/clientProperties.txt");
			ManipulaPropriedades userEmail = new ManipulaPropriedades("./properties/userEmail.txt");

			propsServer.lerPropriedade();
			propsClient.lerPropriedade();
			userEmail.lerPropriedade();

		
	}
}
