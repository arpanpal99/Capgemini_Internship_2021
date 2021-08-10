package com.selfLearning.Collection;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    int salary;
    public Employee(){
        super();
    }
    public Employee(String name, int salary){
        super();
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(int salary){
        this.salary = salary;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo {
    enum SortMethod {
        BYNAME,
        BYSALARY;
    };
    public List<Employee> sort(List<Employee> emps, final SortMethod method){
        List<Employee> sortedByName = emps 
                .stream() 
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName())) 
                .collect(Collectors.toList());
        List<Employee> sortedBySalary = sortedByName
                .stream() 
                .sorted((p1, p2) -> p1.getSalary() - p2.getSalary()) 
                .collect(Collectors.toList());
        if(method == SortMethod.BYNAME)
        return sortedByName;
        else 
        return sortedBySalary;
    }
    public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character){
        boolean b;
        b = entities
            .stream()
            .anyMatch(p -> p.getName().substring(0,1) == character);
        return b;
    }

}