package com.gabriellazar.derivedqueries;

import com.gabriellazar.derivedqueries.entity.Department;
import com.gabriellazar.derivedqueries.repository.DepartmentRepository;
import com.gabriellazar.derivedqueries.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DerivedqueriesApplication {


	RegionRepository regionRepository;
	DepartmentRepository departmentRepository;

	public DerivedqueriesApplication(RegionRepository regionRepository, DepartmentRepository departmentRepository) {
		this.regionRepository = regionRepository;
		this.departmentRepository = departmentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DerivedqueriesApplication.class, args);
	}

	@PostConstruct
	public void test(){
		System.out.println(regionRepository.findAllByCountry("Canada"));
		System.out.println(regionRepository.findDistinctByCountry("Canada"));
		System.out.println(regionRepository.findByCountryContaining("United"));
		System.out.println(regionRepository.findByCountryContainingOrderByRegion("United"));
		System.out.println(regionRepository.findTop2ByCountry("United"));
		System.out.println("-----------------------------------------------------");

	}

}
