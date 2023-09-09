package practice.javaprograms2;

import java.util.Arrays;

import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class EmployeeListPrintDuplicateInMap {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee(2616, "Arief", "Asclipies"),
				new Employee(2618, "Petchi", "Evolve"), new Employee(2511, "Navas", "MDU"),
				new Employee(2516, "Rahim", "Cansas"), new Employee(2216, "Pandi", "Avant"),
				new Employee(2316, "Rohit", "Edu"), new Employee(2316, "Rohit", "EoText"));
		System.out.println(list.size());
		System.out.println(list);

		Map<String, String> map = list.stream()
				.collect(Collectors.toMap(Employee::getName, Employee::getDept, (oldValue, NewValue) -> oldValue));

		map.entrySet().forEach(e -> System.out.println(e.getKey() + " works at " + e.getValue()));
	}
}
