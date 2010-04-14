package ngt.williaminc.core.type;

public abstract class Type {
	
	public abstract Object toType();
	
	public abstract Type sum_operator(Type oth);

}
