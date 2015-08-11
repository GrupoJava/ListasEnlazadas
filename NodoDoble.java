public class NodoDoble<E> extends Nodo<E>{
	
	private Nodo<E> previous;
	
	
	
	public NodoDoble(E v) {
		super(v);
		// TODO Auto-generated constructor stub
	}

	public Nodo<E> getPrevious() {
		return previous;
	}
	public void setPrevious(Nodo<E> previous) {
		this.previous = previous;
	}	
}