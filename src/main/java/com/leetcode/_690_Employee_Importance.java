package com.leetcode;

import java.util.List;


public class _690_Employee_Importance {
	
	
//	Runtime: 59 ms, faster than 5.29% of Java online submissions for Employee Importance.
//	Memory Usage: 50.8 MB, less than 9.52% of Java online submissions for Employee Importance.
    public int getImportance(List<Employee> employees, int id) {
    
    	int importance = 0;
    	if(employees == null ) return 0;
    	
    	Employee employee = findeEmployee(employees, id);
    	
    	if(employee == null) return 0;
    	
    	importance+=employee.importance;
    	
    	if(employee.subordinates != null) {
    	
	      importance+=subordinatesImportance(employee.subordinates, employees);
    	}
    	
    	return importance;
    }
    
    public int subordinatesImportance(List<Integer> sub,List<Employee> employees) {
    	
    	int imp = 0;
    	
    	for(int emp : sub) {
    		Employee aux =  findeEmployee(employees, emp);
    		
    		imp+=aux.importance;
    		
    		if(aux.subordinates != null && !aux.subordinates.isEmpty()) {
    			imp += subordinatesImportance(aux.subordinates, employees);
    		}
    		
    	}
    	
    	return imp;
    }
    
    
    public Employee findeEmployee(List<Employee> employees, int id) {
    	
    	return employees.stream().filter(e->e.id == id).findFirst().orElse(null);
    }
    
    

    


    
    
    
    
    
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }
}
