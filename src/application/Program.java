package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		
		System.out.println("=== Test 1: seller findById ====");
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);
		System.out.println("");
		
		System.out.println("=== Test 2: seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("");
		
		System.out.println("=== Test 3: seller findAll ====");
		list = sellerDAO.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("");
		
		System.out.println("=== Test 4: seller inset===");
		seller = new Seller(null,"Gregorio","gregorio@gmail.com",new Date(),5000.0,department);
		sellerDAO.insert(seller);
		System.out.println("Inserted! New id: " + seller.getId());
		System.out.println("");
		
		System.out.println("=== Test 5: seller findById ====");
		seller = sellerDAO.findById(1);
		seller.setName("Martha");
		sellerDAO.update(seller);
		System.out.println("Update completed!");
		System.out.println("");
		
		System.out.println("=== Test 6: seller delete ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDAO.deleteById(20);
		System.out.println("Delete completed");
	}

}
