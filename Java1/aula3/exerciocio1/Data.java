class Data{
	int dia,mes,ano;
	
	private boolean leapYear(int year){
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}
	
	public boolean preencheData(int dia,int mes,int ano){
		if(mes == 2){
			if(!leapYear(ano)){
				if(dia > 0 && dia <= 28){
					this.dia = dia;
				}else{
					return false;				
				}
			}else{
				if(dia > 0 && dia <= 29){
					this.dia = dia;
				}else{
					return false;				
				}
			}
		}else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
			if(dia > 0 && dia <= 31){
				this.dia = dia;
			}else{
				return false;				
			}			
		}else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
			if(dia > 0 && dia <= 30){
				this.dia = dia;
			}else{
				return false;				
			}			
		}		
		
		this.mes = mes;
		this.ano = ano;
		
		return true;
	}
		
	String mostra(){
		return this.dia+"/"+this.mes+"/"+this.ano;
	}
}