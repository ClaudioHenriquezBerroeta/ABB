class ABB{
	NodoABB raiz;

	ABB(){
		raiz=null;
	}

	public void insertar(int x){ //NodoABB insertar(int x, NodoABB raiz)
		if(raiz==null){
			raiz=new NodoABB(x);
		}else{
			if(x<raiz.dato){
				raiz.hIzq=insertar(x,raiz.hIzq);
			}else{
				raiz.hDer=insertar(x,raiz.hDer);
			}
		}

	}
	private NodoABB insertar(int x, NodoABB raiz){
		if(raiz==null){
			raiz=new NodoABB(x);
		}else{
			if(x<raiz.dato){
				raiz.hIzq=insertar(x,raiz.hIzq);
			}else{
				raiz.hDer=insertar(x,raiz.hDer);
			}
		}
		return raiz;
	}
	public void preorden(){
		if(raiz!=null){
			System.out.println(raiz.dato);
			preorden(raiz.hIzq);
			preorden(raiz.hDer);
		}
	}
	private void preorden(NodoABB raiz){
		if(raiz!=null){
			System.out.println(raiz.dato);
			preorden(raiz.hIzq);
			preorden(raiz.hDer);
		}
	}
	public void inorden(){
		if(raiz!=null){
			inorden(raiz.hIzq);
			System.out.println(raiz.dato);
			inorden(raiz.hDer);
		}
	}
	private void inorden(NodoABB raiz){
		if(raiz!=null){
			inorden(raiz.hIzq);
			System.out.println(raiz.dato);
			inorden(raiz.hDer);
		}
	}

	public void postorden(){

	}
	private void postorden(NodoABB raiz){

	}

	public boolean buscar(int x){
		if(raiz==null){
			return false;
		}else{
			if(x==raiz.dato){
				return true;
			}else{
				if(x<raiz.dato){
					return buscar(x,raiz.hIzq);
				}
				else
					return buscar(x,raiz.hDer);
			}
		}
	}
	private boolean buscar(int x, NodoABB raiz){
		if(raiz==null){
			return false;
		}else{
			if(x==raiz.dato){
				return true;
			}else{
				if(x<raiz.dato){
					return buscar(x,raiz.hIzq);
				}
				else
					return buscar(x,raiz.hDer);
			}
		}
	}
	private int buscaMayorMenores(NodoABB raiz){
		while(raiz.hDer!=null){
				raiz=raiz.hDer;
		}
		return raiz.dato;

	}
	public void eliminar(int x){
		if(raiz==null){
			System.out.println("El elemento no se encuentra");

		}else{
			if(x==raiz.dato){ //encontré el dato a eliminar
				if(raiz.esHoja()){//sin hijos
					raiz=null;
				}else{
					if(raiz.hIzq==null&&raiz.hDer!=null){//un hijo
						raiz=raiz.hDer;
					}else{
						if(raiz.hIzq!=null&&raiz.hDer==null){//un hijo
							raiz=raiz.hIzq;
						}else{//tiene 2 hijos
							raiz.dato=buscaMayorMenores(raiz.hIzq);//reemplaza el dato
							raiz.hIzq=eliminar(raiz.dato,raiz.hIzq);
						}
					}
				}
			}else{
				if(x<raiz.dato){
					raiz.hIzq =eliminar(x,raiz.hIzq);
				}
				else
					raiz.hDer =eliminar(x,raiz.hDer);
			}
		}
	}
	private NodoABB eliminar(int x, NodoABB raiz){
		if(raiz==null){
			System.out.println("El elemento no se encuentra");
		}else{
			if(x==raiz.dato){ //encontré el dato a eliminar
				if(raiz.esHoja()){//sin hijos
					raiz=null;
				}else{
					if(raiz.hIzq==null&&raiz.hDer!=null){//un hijo
						raiz=raiz.hDer;
					}else{
						if(raiz.hIzq!=null&&raiz.hDer==null){//un hijo
							raiz=raiz.hIzq;
						}else{//tiene 2 hijos
							raiz.dato=buscaMayorMenores(raiz.hIzq);//reemplaza el dato
							raiz.hIzq=eliminar(raiz.dato,raiz.hIzq);
						}
					}
				}
			}else{
				if(x<raiz.dato){
					raiz.hIzq=eliminar(x,raiz.hIzq);
				}
				else
					raiz.hDer=eliminar(x,raiz.hDer);
			}
		}
		return raiz;
	}
}