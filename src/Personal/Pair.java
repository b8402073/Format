package Personal;
public final class Pair {
	public final Integer i_start, i_end;

	public Pair(Integer start, Integer end) {
		i_start = start;
		i_end = end;
	}

	public Integer getStart() {
		return i_start;
	}

	public Integer getEnd() {
		return i_end;
	}
	public String toString() {
		return("["+i_start+","+i_end+"]");
	}
        public boolean equals(Object that) {
            if (that instanceof Pair) {
                Pair hand=(Pair) that;
                if (hand.i_start==i_start && hand.i_end==i_end)
                    return true;
            }
            return false;
        }
}