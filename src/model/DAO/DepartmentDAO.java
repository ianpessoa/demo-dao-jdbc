package model.DAO;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface DepartmentDAO {
	
	void insert(Department obj);
	
	void update(Department obj);
	
	void deleteById(Integer id);
	
	Department findById(Integer id);
	
	List<Department> findAll();

	Department findBySeller(Seller seller);
}
