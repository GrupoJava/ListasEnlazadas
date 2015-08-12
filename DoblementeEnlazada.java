public class DoblementeEnlazada <E> extends SimplementeEnlazada <E>{

	private NodoDoble <E> previous;

	public DoblementeEnlazada(E v) {
		super();

	}

	public NodoDoble<E> getPrevious() {
		return previous;
	}

	public void setPrevious(NodoDoble<E> previous) {
		this.previous = previous;
	}
	
	
	
	

}