package com.xworkz.Perfume.PerfumeTester;

import java.util.ArrayList;

import java.util.List;

import com.xworkz.Perfume.Service.ServiceDAO;
import com.xworkz.Perfume.Service.ServiceDAOImpl;
import com.xworkz.Perfume.dao.PerfumeDAO;
import com.xworkz.Perfume.dao.PerfumesDAOImpl;
import com.xworkz.Perfume.dto.PerfumeDTO;

public class PerfumeTester {
	static List<PerfumeDTO> list = new ArrayList<PerfumeDTO>();

	public static void main(String[] args) {
		PerfumeDTO perfumeDTO = new PerfumeDTO();
		perfumeDTO.setName("Fogg");
		perfumeDTO.setPrice(230);
		perfumeDTO.setQuntity(150);
		perfumeDTO.setFlavour("Blue Ocean");
		
		//PerfumeDTO perfumeDTO1 = new PerfumesDAOImpl;

		PerfumeDTO perfumeDTO1 = new PerfumeDTO();
		perfumeDTO1.setName("CK");
		perfumeDTO1.setPrice(1900);
		perfumeDTO1.setFlavour("lilyofthevalley");
		perfumeDTO1.setQuntity(150);

		PerfumeDAO perfumeDAO = new PerfumesDAOImpl(list);
		perfumeDAO.save(perfumeDTO);
		
		
		PerfumeDAO perfumeDAO1 = new PerfumesDAOImpl(list);
		perfumeDAO1.save(perfumeDTO1);
		
		ServiceDAO serviceDAO=new ServiceDAOImpl(perfumeDAO);
		serviceDAO.serviceAndSave(perfumeDTO);
		
		ServiceDAO serviceDAO1=new ServiceDAOImpl(perfumeDAO1);
		serviceDAO1.serviceAndSave(perfumeDTO1);
		

		
		PerfumeDTO DTOfound=perfumeDAO.findByName("Fogg");
		System.out.println(DTOfound);
		
		
	 boolean updatePriceByName=perfumeDAO.updatePriceByName("Fogg", 450); //
		  System.out.println(updatePriceByName);
		  
		  
		  
		 boolean deleteByName=perfumeDAO.deleteByName("CK"); 
		  System.out.println("deleted"+ " "+deleteByName);
		 
		System.out.println(perfumeDAO.getAll());
	}

}
