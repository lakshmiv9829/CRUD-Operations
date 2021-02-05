package com.xworkz.Perfume.dao;

import java.util.List;

import com.xworkz.Perfume.dto.PerfumeDTO;

public interface PerfumeDAO {
	boolean save(PerfumeDTO dto);
	PerfumeDTO findByName(String name);
	boolean updatePriceByName(String name,double price);
	boolean deleteByName(String name);
	public List<PerfumeDTO>getAll();

}
