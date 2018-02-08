package Arrays_PRUEBAS_CLASE;

public class Multiplosde7_CienPrimerosImpares {

	public static void main(String[] args) {
		
		int naturales[],numero=1,cuentasietes=0;
		naturales=new int[100];
		
		for (int i=0; i<naturales.length;i++){
			naturales[i]=numero;
			numero+=2;
			
		if(naturales[i]%7==0)
			cuentasietes ++; 
			System.out.println("El nº de multiplos de 7 es: "+cuentasietes);
		}	
	}
}
