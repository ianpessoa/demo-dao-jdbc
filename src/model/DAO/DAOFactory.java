package model.DAO;

import model.DAO.impl.SellerDAOJDBC;

public class DAOFactory {
	
	public static SellerDAOJDBC createSellerDAO() {
		return new SellerDAOJDBC();
	}
}
