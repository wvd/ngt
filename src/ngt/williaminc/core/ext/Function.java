package ngt.williaminc.core.ext;

import java.util.HashMap;
import java.util.Map;

import ngt.williaminc.core.type.*;

public class Function {
	
	private Map<String, Type> localVariables = new HashMap<String, Type>();

	public Function(Map<String, String> args) {
		for (String a : args.keySet()) {
			localVariables.put(a, CollType.newType(args.get(a), 0));
		}
		for (String b : this.localVariables.keySet()) {
			System.out.print(b + localVariables.get(b));
		}
	}
	
	public boolean isDefined(String varName) {
		return localVariables.containsKey(varName);
	}
	
	public Type getVariable(String varName) {
		return localVariables.get(varName);
	}
	
	public void putVar(String name, Type t) {
		localVariables.put(name, t);
	}
}
