package com.mz.ig.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mz.ig.core.entity.SchoolEntity;
import com.mz.ig.core.entity.UserEntity;
import com.mz.ig.core.repository.ISchoolRepository;

/**
 * Arnancio Langane
 */
@Service
public class SchoolServiceImpl implements ISchoolService {

	@Autowired
	private ISchoolRepository schoolRepository;

	@Override
	public SchoolEntity createSchool(UserEntity loggedUser, SchoolEntity school) {
		return this.schoolRepository.save(school);
	}

	public List<SchoolEntity> findAll() {
		return this.schoolRepository.findAll();
	}

}
