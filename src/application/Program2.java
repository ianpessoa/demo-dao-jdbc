package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.DAO.DAOFactory;
import model.DAO.DepartmentDAO;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDAO departmentDAO = DAOFactory.createDepartmentDAO();
		
		System.out.println("=== Test 1: department findById ====");
		Department department = departmentDAO.findById(3);
		System.out.println(department);
		System.out.println("");
		
		System.out.println("=== Test 3: department findBySeller ====");
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		Seller seller = sellerDAO.findById(3);
		department = departmentDAO.findBySeller(seller);
		System.out.println(department);
		System.out.println("");
		
		System.out.println("=== Test 2: department findAll ====");
		List<Department> list = departmentDAO.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		System.out.println("");
		
		System.out.println("=== Test 3: department insert ====");
		department = new Department(null,"Financeiro");
		departmentDAO.insert(department);
		System.out.println("Inserted! New id: " + department.getId());
		System.out.println("");
		
		System.out.println("=== Test 4: department findById ====");
		department = departmentDAO.findById(1);
		department.setName("Martha");
		departmentDAO.update(department);
		System.out.println("Update completed!");
		System.out.println("");
		
		System.out.println("=== Test 5: department delete ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDAO.deleteById(id);
		System.out.println("Delete completed");
	}

}
