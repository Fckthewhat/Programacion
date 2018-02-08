package Excepciones;

public class Ecuacion_JJ {
	public static void resolverEcuacion(float a, float b, float c) throws DiscriminanteNegativoException, NoSegundoGradoException_JJ{
		float discriminador = (a*a-4*a*c);
		if(discriminador<0)
			throw new DiscriminanteNegativoException();
		if(a==0)
			throw new NoSegundoGradoException_JJ();
	}
}
