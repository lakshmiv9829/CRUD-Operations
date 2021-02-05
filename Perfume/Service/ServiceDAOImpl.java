package com.xworkz.Perfume.Service;

import com.xworkz.Perfume.dao.PerfumeDAO;
import com.xworkz.Perfume.dto.PerfumeDTO;

public class ServiceDAOImpl implements ServiceDAO {
	private PerfumeDAO perfumeDAO;

	public ServiceDAOImpl(PerfumeDAO dao) {
		System.out.println("ServiceDAOImpl");
		this.perfumeDAO = dao;
	}

	@Override
	public boolean serviceAndSave(PerfumeDTO perfumeDTO) {
		boolean validate=false;
		if(perfumeDTO!=null) {
			System.out.println("perfume is valid");
			
			
			String name=perfumeDTO.getName();
			if(name!=null&& !name.contains(" ") && !name.isEmpty()) {
				System.out.println("name is valid");
				validate=true;
			}else {
				System.out.println("name is invalid");
				validate=false;
			}
			if(validate) {
				int price=(int) perfumeDTO.getPrice();
				if(price!=0) {
				System.out.println("Prive is valid");
				validate=true;
			}
			else {
				System.out.println("price is in valid");
				validate=false;
			}
			}
			if(validate) {
				String flavour=perfumeDTO.getFlavour();
				if(flavour!=null && !flavour.contains(" ")&& !flavour.isEmpty()) {
					System.out.println("flavour is valid");
					validate=true;
					}
			
			else {
				System.out.println("flavour is invalid");
				validate=false;
			}
			}
			if(validate) {
				int quantity=perfumeDTO.getQuntity();
				if(quantity!=0) {
					System.out.println("quantity is valid");
					validate=true;
				}
				else {
					System.out.println("quantity is in valid");
					return false;
				}
			}
			if(validate) {
				System.out.println("validation is done");
				this.perfumeDAO.save(perfumeDTO);
			}
			else {
				System.out.println("validation failed");
			}
		}
		return false;
	}

}
