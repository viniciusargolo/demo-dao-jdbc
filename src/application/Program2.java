package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDAO departmentDao = DaoFactory.CreateDepartmentDao();
		
		System.out.println("=== TEST 1: department insert ===");
		Department dep = new Department(null, "Toys");
		departmentDao.insert(dep);
		System.out.println("Department inserted!");
		
		System.out.println("=== TEST 2: department findById ===");
		Department department = departmentDao.findById(1);
		System.out.println("Department Finded: " + department);
		
		System.out.println("=== TEST 3: department Update ===");
		department = departmentDao.findById(5);
		department.setName("Watchs");
		departmentDao.update(department);
		System.out.println("Department has been updated!");
		
		System.out.println("=== TEST 4: department findAll ===");
		List<Department> deps = departmentDao.findAll();
		System.out.println(deps);
		
		System.out.println("=== TEST 5: department delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteByID(id);
		System.out.println("Department deleted successfully!");
		
		
		sc.close();
		
	}

}
