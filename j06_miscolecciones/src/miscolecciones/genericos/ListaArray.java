package miscolecciones.genericos;


public class ListaArray<T> implements Lista<T> {
	
	
	private Object[] almacen;
	private int cant;
	
	public ListaArray() {
		this(10);
	}

	public ListaArray(int tamanyo) {
		super();
		almacen = new Object[tamanyo];
	}
	
	
	@Override
	public void agregar(T dato) {
		if (almacen.length ==cant)
			redimensionar();
		almacen[cant++] = dato;
		
	}

	@Override
	public T eliminar(int pos) {
			return null;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T buscar(int pos) {
		if(pos < 0 || pos >= cant)
			return null;
//			throw new ArrayIndexOutOfBoundException();
		return (T)almacen[pos];
	}

	@Override
	public boolean vacia() {		
		return cant == 0;
	}

	@Override
	public int largo() {	
		return cant;
	}
	
	
	private void redimensionar() {
		Object[] nuevo = new Object[almacen.length * 2];
		for(int i = 0; i<almacen.length; i++) {
			nuevo[i] = almacen[i];
		}
		almacen = nuevo;
	}



}
