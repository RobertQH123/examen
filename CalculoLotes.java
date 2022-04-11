package pecera;


public class CalculoLotes {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrCajas ={150,200,100};
		int[] arrCajas2 ={150,200,100,100055};
		System.out.println(calcularLote(arrCajas));
		System.out.println(calcularLote(arrCajas2));
	}
	
	public static int calcularLote(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<10000) {
				sum += array[i];
			}else {
				System.out.println("el elemento "+i+" del array pasa la restriccion");
				return 0;
			}
				
		}
		return sum;
	}
}
