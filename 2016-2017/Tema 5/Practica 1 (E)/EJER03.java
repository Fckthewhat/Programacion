package PRACTICA1_ENTRENAMIENTO; //TERMINAR	

public class EJER03 {
	
	public static double acceso_por_indice (double [] v, int j) throws RuntimeException{
		try{
			if ((0 <= j) && (j <= v.length)){
				return v[j];
			}else {
				throw new RuntimeException ("El indice " + j +
						" no existe en el vector");
			}
		}finally{
			System.out.println("Se acabó el try :D ");

		}
		/**} catch (RuntimeException exc){
		throw exc;
		}*/
	}
	public static void main (String [] args){
		double [] v = new double [15];
		System.out.println(acceso_por_indice (v, 5));
		try{
			acceso_por_indice (v, 5);
		}catch (RuntimeException exc){
			System.out.println(exc.getMessage());
		throw exc;
		}
	}
}
