public class maain {

	public static void main(String[] args) {
		
		lista l1 = new lista();
		lista l2 =new lista();
		System.out.println("lista ordenada");
		l1.insert(1);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		l1.insert(7);
		l1.print();
		System.out.println();
		l2.insert(4);
		l2.insert(5);
		l2.insert(7);
		l2.insert(9);
		l2.print();
		System.out.println();
		lista result = l1.getComunes(l2);
		result.print();
		System.out.println();
		System.out.println("lista desordenada");
		lista l3=new lista();
		
		lista l4 =new lista();
		
		CargarLista(l3,10);
		CargarLista(l4,20);
		l3.print();
		System.out.println();
		l4.print();
		System.out.println();
		lista result2= l3.getComunes(l4);
		result2.print();
		
		
		
		
		
		
	}
	public static void CargarLista(lista list, int cantElem){
		int cont=0;
		while(cont<cantElem){
			int valor = (int) (Math.random() * 20) + 1;
			list.insert(valor);
			cont++;
		}
	}
	
	



	}
