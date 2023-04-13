package view;

import daCruz.Gustavo.pilhaint.Pilha;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		int mostra; 
		
		for(int i = 100; i < 115; i++) {
			if(p.isEmpty()) {
				p.Push(i + 100);
			} else {
				if(p.Size() <= 4) {
					p.Push(i + 50);
				} else {
					try {
						p.Pop();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			try {
				System.out.println(p.Top());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int tamanho = p.Size();
		System.out.println("Tamanho da Pilha " + tamanho);
		
		for(int i = 0; i < tamanho; i++) {
			try {
				mostra = p.Top();
				System.out.println(mostra);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				p.Pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
