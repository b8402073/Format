/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.Comparator;

/**
 *
 * @author easterday
 */
public class PairSort implements Comparator {

    public int compare(Object obj1, Object obj2) {
        Pair E1 = (Pair) obj1;
        Pair E2 = (Pair) obj2;
        if (E1.getStart() < E2.getStart()) {
            return -1;
        } else if (E1.getStart() > E2.getStart()) {
            return 1;
        } else {
            return 0;
        }
    }
}
