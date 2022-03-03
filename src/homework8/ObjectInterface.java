package homework8;

import java.util.Collection;

public interface ObjectInterface {
    boolean add(CustomObject o);

    boolean add(int index, CustomObject o);

    boolean delete ();

    CustomObject get(int index);

    boolean contain(CustomObject o);

    boolean equals (Collection str);

    boolean clear();

    int size();
}
