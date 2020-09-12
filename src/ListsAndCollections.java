import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ListsAndCollections {

	public static void main(String[] args) {
		
		//#1: Create an instance of an ArrayList of String called employeeNames
		ArrayList<String> employeeNames = new ArrayList<String>();
		//#2: Create an instance of a HashSet of Integer called ids
		HashSet<Integer> ids = new HashSet<Integer>();
		//#3: Create an instance of a HashMap of Integer, String called employeeMap
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
		//#4: Add at least five entries to the employeeNames and ids 
		//(make sure both collections have the same number of entries).
		employeeNames.add("Matthew");
		employeeNames.add("Anthony");
		employeeNames.add("Bev");
		employeeNames.add("Charles");
		employeeNames.add("Dana");
		ids.add(101);
		ids.add(102);
		ids.add(103);
		ids.add(104);
		ids.add(105);
		
		//#5: Create a variable int i = 0; 
		//then iterate over ids using an enhanced for loop. 
		//Inside the enhanced for loop use employeeMap.put() to add a new entry to the map. 
		//The entry should consist of a key that is the id in the enhanced loop’s current iteration, 
		//and a value that is the employeeName at position i of the employeeNames ArrayList. 
		//Increment i so that each iteration grabs the next element in the ArrayList.
		int i=0;
		for(Integer id: ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		//Print #5:
		System.out.println(employeeMap);
		
		//#6: Once the employeeMap is fully populated, 
		//use another enhanced for loop to iterate over the employeeMap.keySet(), 
		//and use the key for each current iteration to print to the console both 
		//the current key and its associated value in the map.
		System.out.println("Number 6:");
		Set<Integer> employeeMapKeySet = employeeMap.keySet();
		for(Integer key: employeeMap.keySet()) {
			System.out.println(key + ": " + employeeMap.get(key));
		}
		
		//#7: Create a StringBuilder called idsBuilder.
		StringBuilder idsBuilder = null;
		
		//#8: Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder
		//#9: Print the result of idsBuilder.toString() to the console.
		System.out.println("Answers to 8 & 9: ");
		for(Integer id: ids) {
			idsBuilder = new StringBuilder(id + "-");
			System.out.println(idsBuilder.toString());
		}
		
		//#10: Create another StringBuilder called namesBuilder.
		StringBuilder namesBuilder = null;
		
		//#11: Iterate over the employeeNames ArrayList and append each name, 
		//followed by a space “ “ to the namesBuilder.
		//#12: Print the result of namesBuilder.toString() to the console.
		System.out.println("Answers to 11 & 12: ");
		for(String employees: employeeNames) {
			namesBuilder = new StringBuilder(employees + " ");
			System.out.println(namesBuilder.toString());
			
		}
		//Complete list
		StringBuilder fullList = null;
		for(int listBuild: employeeMap.keySet()) {
			fullList = new StringBuilder(listBuild + "-");
			fullList.append(employeeMap.get(listBuild));
			System.out.println(fullList.toString());
		}

	}

}
