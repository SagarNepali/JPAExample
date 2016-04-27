/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.self.dao;

import com.dumbweb.self.entity.Employee;
import java.util.List;

/**
 *
 * @author user
 */
public interface EmployeeDAO {
     void insert(Employee e);

    void update(Employee e);

    void delete(int id);

    List<Employee> getAll();

    Employee getById(int id);
}
