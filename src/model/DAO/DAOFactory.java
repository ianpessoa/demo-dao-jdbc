package model.DAO;

import db.DB;
import model.DAO.impl.DepartmentDAOJDBC;
import model.DAO.impl.SellerDAOJDBC;

public class DAOFactory {
	
	public static SellerDAOJDBC createSellerDAO() {
		return new SellerDAOJDBC(DB.getConnection());
	}
	
	public static DepartmentDAOJDBC createDepartmentDAO() {
		return new DepartmentDAOJDBC(DB.getConnection());
	}
}
