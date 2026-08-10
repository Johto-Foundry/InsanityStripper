package server.world.map;

import java.util.ArrayList;

public class C {

    public C(ArrayList<Integer> arraylist, int i) {
        I = new ArrayList<Integer>();
        Z = i;

        for (Integer value : arraylist) {
            I.add(value);
        }
    }

    @Override
    public final int hashCode() {
        int i = 1;
        i = 31 * i + (I != null ? I.hashCode() : 0);
        return i;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        C c = (C) obj;

        if (I == null) {
            return c.I == null;
        }

        return I.equals(c.I);
    }

    public ArrayList<Integer> I;
    public int Z;
}