package ngt.williaminc.core.type;

import java.math.BigInteger;

public class Nummer extends Type {
	
	private int nummer;
	
	public Nummer(Object o) {
		this.nummer = (Integer) o;
	}
	
	public Nummer(int i) {
		this.nummer = i;
	}
	
	public Type sum_operator(Type oth) {
		if (oth instanceof Nummer) {
			return new Nummer(this.getValue() + ((Nummer) oth).getValue());
		}
		return null;
	}

	@Override
	public Object toType() {
		return (Object) BigInteger.valueOf(this.nummer);
	}
	
	public int getValue() {
		return this.nummer;
	}

}
