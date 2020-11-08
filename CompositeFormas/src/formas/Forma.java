package formas;

import utils.CompositeIterator;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Forma extends FormaComponent {
    private ArrayList<FormaComponent> formas = new ArrayList<>();
    private String nombre;
    private CompositeIterator iterator;

    public Forma(String nombre) {
        super();
        this.nombre = nombre;
    }

    @Override
    public void dibuja() {
        System.out.println(MessageFormat.format("Forma({0}) {1}", this.nombre, '{'));
        for (FormaComponent forma : formas) {
            int p = forma.profundidad();
            System.out.print("\t".repeat(p));
            forma.dibuja();
        }
        System.out.print("\t".repeat(this.profundidad()));
        System.out.println("}");
    }

    @Override
    public void desplazaRelativo(int x, int y) {
        for (FormaComponent forma : formas) {
            forma.desplazaRelativo(x, y);
        }
    }

    @Override
    public void anade(FormaComponent fc) {
        fc.padre = this;
        this.formas.add(fc);
    }

    @Override
    public void elimina(FormaComponent fc) {
        this.formas.remove(fc);
    }

    @Override
    public CompositeIterator createIterator() {
        this.iterator = new CompositeIterator(formas.iterator());
        return this.iterator;
    }
}
