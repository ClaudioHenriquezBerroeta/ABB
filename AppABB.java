class AppABB{
	public static void main(String[] args) {
		ABB a = new ABB();
		a.insertar(5);
		a.insertar(2);
		a.insertar(8);
		a.insertar(1);
		a.insertar(3);
		//System.out.println("raiz "+a.raiz.dato);
		//System.out.println("hijo izquierdo "+a.raiz.hIzq.dato);
		//System.out.println("hijo derecho "+a.raiz.hDer.dato);
		//System.out.println("hijo izquierdo del hijo izquierdo "+a.raiz.hIzq.hIzq.dato);
		a.preorden();
		a.inorden();
		a.postorden();
		int dato=0;
		if(a.buscar(dato))
			System.out.println("El número "+dato+ " si existe en el árbol");
		else
			System.out.println("El número "+dato+ " no existe en el árbol");
		a.eliminar(3);
		a.preorden();
		a.eliminar(2);
		a.preorden();


	}

}