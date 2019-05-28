package br.com.hugovieira.trabalho.unifcv;

public class Validacao {
	
	public static void notNull(Object value, String field) {
		if (value == null) {
			throw new RuntimeException("Campo " + field +" é obrigatorio");
		}
	}

}
