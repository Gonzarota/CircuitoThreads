package com;

import java.util.Comparator;

public class CocheComparetor implements Comparator <Coche> {

    @Override
    public int compare(Coche o1, Coche o2) {
        if(o1.getResultado() > o2.getResultado()){
            return  1;
        }
        if(o1.getResultado() < o2.getResultado()){
            return -1;
        }
        return 0;
    }
}
