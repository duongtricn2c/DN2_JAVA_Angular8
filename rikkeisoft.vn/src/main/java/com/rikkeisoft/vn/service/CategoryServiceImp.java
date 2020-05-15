package com.rikkeisoft.vn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rikkeisoft.vn.dao.CategoryDAO;
import com.rikkeisoft.vn.model.Category;

@Service
public class CategoryServiceImp implements CategoryService {
	
	@Autowired
	private CategoryDAO categoryDAO;

	@Transactional
	@Override
	public List<Category> get() {
		// TODO Auto-generated method stub
		return categoryDAO.get();
	}

	@Transactional
	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return categoryDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Category cat) {
		categoryDAO.save(cat);
	}

	@Transactional
	@Override
	public void delete(int id) {
		categoryDAO.delete(id);
		
	}


}