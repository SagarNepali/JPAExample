/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.self.dao;

import com.dumbweb.self.entity.Department;
import java.util.List;

/**
 *
 * @author user
 */
public interface DepartmentDAO {
     void insert(Department d);

    void update(Department d);

    void delete(int id);

    List<Department> getAll();

    Department getById(int id);
}
