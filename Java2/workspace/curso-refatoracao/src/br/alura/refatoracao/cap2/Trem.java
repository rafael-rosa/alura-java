package br.alura.refatoracao.cap2;

import java.util.List;

public class Trem {

	private List<Vagao> vagoes;
	private int capacidade;
	
	public boolean podeReservar(int lugaresAReservar) {
		
		int lugaresDisponiveis = capacidade - lugaresReservados();
		return lugaresDisponiveis > lugaresAReservar; 
	}

	private int lugaresReservados() {
		int lugaresReservados = 0;
		for(Vagao v : vagoes) {
			lugaresReservados += v.reservados();
		}
		return lugaresReservados;
	}
	
}