package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modal.Skill;

@Service
public class SkillService {

	@Autowired
	private SkillRepository skillRepository;

	@Transactional
	public void save(Skill skill) {
		skillRepository.save(skill);
	}
	@Transactional
	public Skill get(Integer id) {
		return skillRepository.findById(id).get();
	}
}
