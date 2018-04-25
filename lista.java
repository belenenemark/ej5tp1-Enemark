
public class lista {
protected Node first;
protected Node last;
protected int size;

	public lista(){
		first =null;
		last = null;
		size=0;
	}
	
	public int getsize(){
		return size;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public Node getFirst() {
		return first;
	}
	
	public Node getLast(){
		return last;
	}
	
	public void insert(int n){
		Node tmp= new Node(n,null);
		if(first==null){
			first=tmp;
			last = tmp;
			size++;
			
		}else{
			last.setNext(tmp);
			last = tmp;
			size++;
			
		}
		
	}
	
	public boolean esOrdenada(){
		boolean condicion = true;
		Node aux = first;
		while(aux != null && condicion){
			if(aux.getNext()!= null){
				if(aux.getInfo()>aux.getNext().getInfo()){
					condicion = false;
				}
			}
			aux = aux.getNext();
		}
		
		return condicion;
	}
	
	public void print(){
		Node tmp = first;
		while (tmp != null){
			System.out.print(tmp.getInfo()+"--");
			tmp=tmp.getNext();
			
		}
	}
	
	public boolean buscar(int ref){
		Node aux = first;
		boolean encontrado = false;
			while(aux!=null && encontrado != true){
				if(ref == aux.getInfo()){
					encontrado=true;
				}else{
					aux=aux.getNext();
				}
			}
		
		
		return encontrado;
		
	}
	
	public void inserOrd(int valor){
		Node aux = new Node(valor,null);
		if(this.getFirst()==null){
			this.insert(valor);
			
		}else{
			
				if(first.getInfo()>=valor){
					aux.setNext(first);
					first =aux;
				}else{
					Node cursor = this.getFirst();
					while(cursor.getNext()!=null && cursor.getNext().getInfo()<valor){
						cursor=cursor.getNext();
					}
					if(cursor.getNext()==null){
						this.insert(valor);
					}else{
						aux.setNext(cursor.getNext());
						cursor.setNext(aux);
					}
					
				}
	}
	
	}
	public  lista getComunes( lista acompara){
		lista result = new lista();
		Node cursor1 = first;
			
		
			if(this.esOrdenada() && acompara.esOrdenada()){
				while(cursor1 != null){
					if(acompara.buscar(cursor1.getInfo())){
						result.insert(cursor1.getInfo());
					}
					cursor1= cursor1.getNext();
				} 
			}else{
				while(cursor1 != null){
					if(acompara.buscar(cursor1.getInfo())){
						if(!result.buscar(cursor1.getInfo())){
							result.inserOrd(cursor1.getInfo());
						}
						
					}
					cursor1= cursor1.getNext();
				}
			}	
				
			
				return result;
			
			}
	}

