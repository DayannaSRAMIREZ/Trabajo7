package conjunto;

import java.util.List;

public class Objetos implements Conjunto {
    private List<Object> listaObjetos;

    public Objetos(List<Object> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    @Override
    public boolean pertenece(Object o) {
        return (listaObjetos.contains(o));
    }
}
