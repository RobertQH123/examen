package pecera;

public class MatrizDiagonal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] matriz = {
                {1,1,1},
                {1,1,1},
                {1,1,1},
        };
        int[][] matriz2 = {
                {-1,1,-7,-8},
                {-10,-8,-5,-2},
                {0,9,7,-1},
                {4,4,-2,1},
        };
        int[][] matriz3 = {
        		{462,0,0},
                {0,0,0},
                {0,0,0},
        };
       
        
        valorTotal(matriz);
        valorTotal(matriz2);
        valorTotal(matriz3);
		
	}
	
	public static int sumarDiagonalP(int[][] matriz) {
	        int suma = 0;
	        int x = 0, y = 0;
	        while (x < matriz.length && y < matriz[0].length) {
	             suma += matriz[y][x];
	             x++;
	             y++;
	        }
	        System.out.println("Diagonal Izquierda a Derecha = "+suma);
	        return suma;
	 }
	
	public static int sumarDiagonalS(int[][] matriz) {
		 int suma = 0;
		 int x = 0, y = matriz.length - 1;
		 while (x < matriz.length && y >= 0) {
			 suma += matriz[y][x];
			 x++;
			 y--;

	 	}
		 System.out.println("Diagonal Izquierda a zquierda = "+suma);
	 	return suma;
	}
	public static void valorTotal(int[][] matriz) {
		System.out.println("Valor Absoluto de la Diferencia = "+(Math.abs(sumarDiagonalP(matriz) -sumarDiagonalS(matriz))));
	}
}


