package pecera;


import java.util.ArrayList;

public class GranjaDePeces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] largoPeces = {3};
		System.out.println(pecera(1, 36, largoPeces).size());
	}
	public static ArrayList<Integer> pecera(int largoMin, int largoMax, int[] largoPeces) {
		ArrayList<Integer> rumArrayList =  peceraa(largoMin,largoMax,largoPeces[0]);
		for (int i = 1; i < largoPeces.length; i++) {
			rumArrayList = peceraa(largoPeces[i],rumArrayList);
		}
		return rumArrayList;
	}
	
	public static ArrayList<Integer> peceraa(int largoMin, int largoMax, int pezi) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		if(largoMin >=1 && largoMin <=1000 && largoMax >= largoMin && largoMax <=1000) {
				int pez = pezi;
				for (int j = largoMin; j <= largoMax; j++) {
					if(!(pez*10 >= j && pez*2 <= j) && !(j*10 >= pez && j*2 <= pez)) {
						arrayList.add(j);
					}

			}
		}
		return arrayList;
		
	}
	public static ArrayList<Integer> peceraa(int pezi, ArrayList<Integer> array) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
				int pez = pezi;
				for (int j = 0; j <= array.size(); j++) {
					if(!(pez*10 >= j && pez*2 <= j) && !(j*10 >= pez && j*2 <= pez)) {
						arrayList.add(j);
					}

			}
		return arrayList;
		
	}
	

}
