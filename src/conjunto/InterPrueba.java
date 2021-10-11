package conjunto;

public class InterPrueba implements Conjunto {

    @Override
    public boolean pertenece(Object o) {
        return ((o instanceof Integer) && (((Integer) o) % 2 == 0));
    }
}
