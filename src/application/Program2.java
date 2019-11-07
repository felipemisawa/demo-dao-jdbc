package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== findById ===");
		System.out.println(departmentDao.findById(1));
		
		System.out.println("=== findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("=== insert ===");
		Department dep = new Department(null,"Test");
		departmentDao.insert(dep);
		System.out.println("Inserted ID: " + dep.getId());
		
		System.out.println("=== update ===");
		dep = departmentDao.findById(1);
		dep.setName("UPDATED");
		departmentDao.update(dep);
		System.out.println("UPDATED!");
		
		System.out.println("=== delete ===");
		departmentDao.deleteById(5);
		System.out.println("Deleted!");

	}

}
