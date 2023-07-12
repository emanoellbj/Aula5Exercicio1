import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(2);
		numeros.add(4);
		numeros.add(1);
		numeros.add(5);

		List<Integer> duplicates = findDuplicates(numeros);
		System.out.println(duplicates);

	}

	public static List<Integer> findDuplicates(List<Integer> numbers) {
		List<Integer> resultado = new ArrayList<>();
		Map<Integer, Integer> countMap = new HashMap<>();

		for (int number : numbers) {
			countMap.put(number, countMap.getOrDefault(number, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				resultado.add(entry.getKey());
			}
		}

		return resultado;
	}
}
