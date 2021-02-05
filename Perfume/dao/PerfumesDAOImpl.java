package com.xworkz.Perfume.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.Perfume.dto.PerfumeDTO;

public class PerfumesDAOImpl implements PerfumeDAO {
	private List<PerfumeDTO> perfumeList;

	public PerfumesDAOImpl(List<PerfumeDTO> list) {
		this.perfumeList = list;
		System.out.println("created PerfumeDAOImpl");
	}
	public PerfumesDAOImpl() {
		this.perfumeList=new ArrayList<PerfumeDTO>();
	}
	@Override
	public boolean save(PerfumeDTO dto) {
		System.out.println("invoked save");
		boolean added = false;
		boolean contains = this.perfumeList.contains(dto);
		if(dto!=null)
		if (!contains) {
			added = this.perfumeList.add(dto);
		}
		if (added) {
			System.out.println("perfume is added");
		} else {
			System.out.println();
		}

		return false;
	}

	@Override
	public PerfumeDTO findByName(String name) {
		System.out.println("invoked findByName");
		for (PerfumeDTO perfumeDTO : this.perfumeList) {
			String nameFromDTO = perfumeDTO.getName();
			if (nameFromDTO.equals(name)) {
				System.out.println("name  found");
				return perfumeDTO;

			}
		}
		return null;
	}

	@Override
	public boolean updatePriceByName(String name, double price) {
		System.out.println("invoked updatePriceByName");
		PerfumeDTO DTOFromDB = this.findByName(name);
		if (DTOFromDB != null) {
			System.out.println("can update, name is found");
			DTOFromDB.setPrice(price);
			System.out.println(DTOFromDB);
			return true;
			
		} else {
			System.out.println("can not update,name not found");
		}

		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		System.out.println("invoked deleteyName");
		Iterator<PerfumeDTO> iterator = perfumeList.iterator();
		while (iterator.hasNext()) {
			PerfumeDTO perfumeDTO = iterator.next();
			if (perfumeDTO.getName().equals(name)) {
				
				System.out.println("delete element");
				System.out.println("before remove: " + perfumeList.size());
				iterator.remove();
				System.out.println("after remove: " + perfumeList.size());
				return true;
			}
		}
		return false;
	}

	@Override
	public List<PerfumeDTO> getAll() {
		System.out.println("invoked getAll");
	
		return this.perfumeList;
	}

}
