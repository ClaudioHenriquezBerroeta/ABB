class ABB{
	NodoABB raiz;

	ABB(){
		raiz=null;
	}

	void insertar(int x){ //NodoABB insertar(int x, NodoABB raiz)
		if(raiz==null){
			raiz=new NodoABB(x);
		}

	}
}