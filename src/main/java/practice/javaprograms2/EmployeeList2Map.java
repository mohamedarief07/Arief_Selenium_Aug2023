package practice.javaprograms2;

import java.util.Arrays;

import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class EmployeeList2Map {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee(2616, "Arief", "Asclipies"),
				new Employee(2618, "Petchi", "Evolve"), new Employee(2511, "Navas", "MDU"),
				new Employee(2516, "Rahim", "Cansas"), new Employee(2216, "Pandi", "Avant"),
				new Employee(2316, "Rohit", "Edu"));
		System.out.println(list.size());
		System.out.println(list);

		// Convert List to Map (ID and NAme)

		Map<Integer, String> map = list.stream().collect(Collectors.toMap(Employee::getEmpID, Employee::getName));
		System.out.println(map.size());
		System.out.println(map);

		// Print Only Name
		map.entrySet().forEach(e -> System.out.println(e.getValue()));

		// Print Only EmpID
		map.entrySet().forEach(e -> System.out.println(e.getKey()));

		// Print both ID and Name
		map.entrySet().forEach(e -> System.out.println(e.getKey() + " --> " + e.getValue()));

		Map<String, String> map2 = list.stream().collect(Collectors.toMap(Employee::getName, Employee::getDept));
		System.out.println(map2);

		// Print Only Name
		map2.entrySet().forEach(e -> System.out.println(e.getKey()));

		// Print Only Dept
		map2.entrySet().forEach(e -> System.out.println(e.getValue()));

		// Print both Name and Dept
		map2.entrySet().forEach(e -> System.out.println(e.getKey() + " works at " + e.getValue()));

	}
}
