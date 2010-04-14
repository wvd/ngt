package ngt.williaminc.core.type;

import java.math.BigInteger;

public class CollType {
	
	public static Type newType(Object o) {
		if (o instanceof Integer || o instanceof BigInteger) {
			return new Nummer(o);
		}
		return null;
	}
	
	public static Type newType(String s, int i) {
		if (s.equals("nummer")) {
			return new Nummer(i);
		}
		return null;
	}

}
