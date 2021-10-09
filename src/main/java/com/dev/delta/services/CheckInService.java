package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.CheckIn;
import com.dev.delta.repositories.CheckInRepository;

@Service
public class CheckInService {


	/**
	 * checkInRepository
	 */
	@Autowired
	private CheckInRepository checkInRepository;

	/**
	 * getCheckIns
	 * 
	 * @return
	 */
	public List<CheckIn> getCheckIns() {
		return checkInRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return checkInRepository.count();
	}

	/**
	 * save
	 * 
	 * @param checkIn
	 */
	public void save(CheckIn checkIn) {
		checkInRepository.save(checkIn);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<CheckIn> findById(int id) {
		return checkInRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		checkInRepository.delete(checkInRepository.findById(id).get());
	}
}
