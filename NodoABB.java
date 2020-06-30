class NodoABB{
	int dato;
	NodoABB hIzq;
	NodoABB hDer;

	NodoABB(){
		this.hIzq=null;
		this.hDer=null;
	}
	NodoABB(int dato){
		this.dato = dato;
		this.hIzq=null;
		this.hDer=null;
	}
	public boolean esHoja(){
		if((this.hIzq==null)&&(this.hDer==null)){
			return true;
		}else{
			return false;
		}
	}
}