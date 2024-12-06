package com.klef.jfsd.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	@Query("SELECT e FROM Employee e WHERE e.email = ?1 AND e.password = ?2")
	Employee checkemplogin(String email, String password);

	@Query("update Employee e set e.status=?1 where e.id=?2 ")
	@Modifying  
	@Transactional 
	public int updateempstatus(String status,int eid);
	
	
	@Query("delete Employee e where e.id=?1")
	@Modifying
	@Transactional 
	public int deleteempbyid(int eid);
	public List<Employee> findByDepartment(String department);
	
	}

