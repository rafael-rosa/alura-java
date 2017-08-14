package rosa.silva.rafael.propriedades;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ManipulaPropriedades {
	private FileInputStream file;
	private Properties props;
	private String filePath;
	
	public ManipulaPropriedades(String filePath){
		this.filePath = filePath;
	}
	
	public void lerPropriedade(){

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					file = new FileInputStream(filePath);
					props = new Properties();
					props.load(file);
					props.list(System.out);
				} catch (IOException e) {
					System.out.println("Erro ao ler as propriedades do arquivo " + filePath);
				}
				
			}
		}).start();		
		
	}

}
