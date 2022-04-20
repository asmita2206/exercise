package com.manager.exercise.client;

import com.manager.exercise.model.Department;
import com.manager.exercise.model.Employee;

import java.util.*;
import java.util.function.Function;

public class ClientTest {

    public static void main(String[] args) {

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(1009,"O", 90000.00,"sam@infotech.com"));
        employeeList.add(new Employee(2009,"N",30000.00,"martin@infotech.com"));
        employeeList.add(new Employee(3009,"M",50000.00,"harry@infotrech.com"));

        Function<Employee, String> firstName = Employee::getEmployeeName;
        Function<Employee, Double> bySalary= Employee::getSalary;

        Comparator<Employee> compareByFirstNameSAlary =Comparator.comparing(firstName).thenComparing(bySalary);

        employeeList.stream().sorted(compareByFirstNameSAlary).forEach(System.out::println);

       /* Iterator<Employee> iterator=employeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Collections.sort(employeeList,Comparator.comparing(Employee::getSalary));
        iterator=employeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Sort By Salary : " +iterator.next());
        }

        Collections.sort(employeeList,(e1,e2)->(e1.getSalary().compareTo(e2.getSalary())));
        System.out.println("Sort By Salary in ascending order: " +employeeList);

        Collections.sort(employeeList,(e1,e2)->(e2.getSalary().compareTo(e1.getSalary())));
        System.out.println("Sort by salary in descending order : "+employeeList);

        Collections.reverse(employeeList);
        iterator=employeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Sort  By Salary in reverse order : " +iterator.next());
        }
        Employee e1= new Employee(1009,"Sam", 90000.00,"sam@infotech.com");
        Employee e2=new Employee(2009,"Martin",30000.00,"martin@infotech.com");
        Employee e3= new Employee(3009,"harry",50000.00,"harry@infotrech.com");
        Employee e4=new Employee(4009,"John",600000.00,"john@infotech.com");
        Employee e5= new Employee(5009, "Joya",70000.00,"joya@infotech.com");

        Department d1= new Department(1001,"IT","BOston");
        Department d2= new Department(1002,"Finance","Chennai");

        List<Department> deptList =new ArrayList<>();
        deptList.add(new Department(1001,"IT","BOston"));
        deptList.add( new Department(1002,"Finance","Chennai"));

      //  Map<Employee,Department> empDeptMap= new HashMap<>();

        Collections.sort(deptList,(d,d3)->(d.getDeptName()).compareTo(d3.getDeptName()));
        System.out.println("Sort by department in ascending order : "+ deptList);

        Collections.sort(deptList,(d,d3)->(d3.getDeptName().compareTo(d.getDeptName())));
        System.out.println("Sort by department in descending order : "+ deptList);

        Map<Employee,Department> empDeptMap= new LinkedHashMap<>();

        empDeptMap.put(e1,d1);
        empDeptMap.put(e2,d1);
        empDeptMap.put(e3,d1);

        empDeptMap.put(e4,d2);
        empDeptMap.put(e5,d2);
        empDeptMap.put(e3,d2);

        empDeptMap.put(null,d1);
        empDeptMap.put(null,d2);




        System.out.println(empDeptMap.size());
        System.out.println(empDeptMap.get(new Employee(1009,"Sam",90000.00,"sam@infotech.com")));

        Set<Map.Entry<Employee,Department>> entrySet =empDeptMap.entrySet();
        for (Map.Entry<Employee,Department> entry : entrySet){
            Employee employee =entry.getKey();
            Department department= entry.getValue();
            System.out.println(employee);
            System.out.println(department);
        }*/


    }

}
