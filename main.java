public class main {

	public static void principal(String[] args) {
    System.out.println("Lista Ordenada:  ");
		int valor;
		valor =2;
		lista list1= new lista();
		list1.insert(valor);
		valor=4;
		list1.insert(valor);
		valor= 8;
		list1.insert(valor);
		list1.print();
    System.out.println("fin lista 1  ");
		lista list2 =new lista();
		valor =4;
		list2.insert(valor);
		valor =8;
		list2.insert(valor);
		valor=9;
		list2.insert(valor);
		list2.print();
     System.out.println("fin lista 2  ");
		lista result = new lista();
		comparador(list1, list2, result);
		result.print();
     System.out.println("fin result  ");
     System.out.println("Lista Desordenada:  ");
		valor =2;
		lista listOne= new lista();
		listOne.insert(valor);
		valor=4;
		listOne.insert(valor);
		valor= 8;
		listOne.insert(valor);
		listOne.print();
    System.out.println("fin lista 1  ");
		lista listTwo =new lista();
		valor =4;
		listTwo.insert(valor);
		valor =8;
		listTwo.insert(valor);
		valor=9;
		listTwo.insert(valor);
		listTwo.print();
     System.out.println("fin lista 2  ");
		lista resultTwo = new lista();
		comparador(list1, list2, resultTwo);
		result.print();
     System.out.println("fin result  ");
		
		
		
		
		
		
	}
	public static void insertarOrd(lista result, int valor){

		if(result.getFirst()==null){
			result.insert(valor);
			
		}else{
			Node cursor = result.getFirst();
				if((int)cursor.getInfo()>=valor){
					result.insert(valor);
				}else{
					Node aux = new Node(valor,null);
					while(cursor.getNext()!=null && (int)cursor.getNext().getInfo()>valor){
						cursor=cursor.getNext();
					}
					if(cursor.getNext()==null){
						cursor.setNext(aux);
					}else{
						aux.setNext(cursor.getNext());
						cursor.setNext(aux);
					}
					
				}
			
		}
		
	
		
		
		
	}
public static void comparador(lista list1, lista list2, lista result){
Node cursor1 = list1.getFirst();

		while(cursor1!=null){
			if(list2.buscar(cursor1.getInfo())){
				int valor =(int)cursor1.getInfo();
        //esto controla valores repetidos
				if(!result.buscar(cursor1.getInfo())){
					insertarOrd(result,valor);
				}
				
				
				cursor1=cursor1.getNext();
			}else{
				cursor1=cursor1.getNext();
			}
		}
	}
	}
	