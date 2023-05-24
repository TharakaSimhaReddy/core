package com.ass.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ass.calculator.CommonUtil;
import com.ass.core.dto.CapUpdate;
import com.ass.core.dto.UserDto;
import com.ass.core.entity.AirHosters;
import com.ass.core.entity.Brand;
import com.ass.core.entity.Captain;
import com.ass.core.entity.Flight;
import com.ass.core.entity.Product;
import com.ass.core.entity.Team;
import com.ass.core.entity.UserEntity;
import com.ass.core.repository.AssoicationRepository;
import com.ass.core.repository.UserHqlRepository;
import com.ass.core.repository.UserRepository;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello Tharak World!");
//
//        int add = CommonUtil.add(2, 11);
//        System.out.println(add);

//		UserEntity entity = new UserEntity();
//         entity.setAltKey(121);
//         entity.setName("nath");
//         entity.setEmail("n@gmail.com");
//         entity.setContactNumber("1234567890");
//         entity.setPassword("******&");
//         entity.setCountry("India");
//         entity.setCity("Bengaluru");
//         entity.setPinCode("0987657");

//		UserRepository repository = new UserRepository();
//         repository.save(entity);
//		repository.delete(12);

//		UserEntity id = repository.findById(123);
//         System.out.println(id);

//		UserDto userDto = new UserDto();
//		userDto.setAltKey(12);
//		userDto.setName("TNR");
//		userDto.setCity("Karimnagar");
//		userDto.setPinCode("1313");
//		userDto.setCountry("PremaDesam");
//
//		repository.update(userDto);

//		UserHqlRepository userHqlRepository = new UserHqlRepository();

//		List<UserEntity> findAll = userHqlRepository.findAll();
//		System.out.println(findAll);
//		findAll.forEach(each->{
//			System.out.println(each);
//		});

//		List<UserEntity> sortedList = findAll.stream()
//		.filter(each->
//		each.getName().equalsIgnoreCase("tnr"))
//		.collect(Collectors.toList());
//		System.out.println(sortedList );

//		List<UserEntity> findByName = userHqlRepository.findByName("tharak");
//		findByName.forEach(each->{
//			System.out.println(each);
//			
//		});

//		userHqlRepository.updatePasswordByEmail("1234", "n@gmail.com");

//		userHqlRepository.deleteUserByEmail("t@gmail.com");

//		Team team = new Team();
//		team.setName("INDIA");
//		team.setTeamSize("11");
//		team.setTeamType("football");
//		
//		Captain captain = new Captain();
//		captain.setCaptainName("Sunil Chetrri");
//		captain.setAge("34");
//		captain.setEmail("sc@gmail.com");
//		
//		team.setCaptain(captain);
//		
//		
		AssoicationRepository assoicationRepository = new AssoicationRepository();
//		assoicationRepository.saveTeamDetails(team);
//		Captain capid = assoicationRepository.findCapid(1);
//		System.out.println(capid);
		
		
		CapUpdate capUpdate = new CapUpdate();
		capUpdate.setAge("38");
		capUpdate.setId(2);
		capUpdate.setName("Sunil chettri");
		
		assoicationRepository.updateCapDetails(capUpdate);

//		Flight flight = new Flight();
//		flight.setFlightName("indigo airlines");
//		flight.setPrice("$17");
//		flight.setFlightNumber("9209");
//		
//		
//		AirHosters airHosters = new AirHosters();
//		airHosters.setName("AirHoster 1");
//		airHosters.setAge("25");
//		
//		AirHosters airHosters2 = new AirHosters();
//		airHosters2.setName("AirHpster 2");
//		airHosters2.setAge("26");
//		
//		AirHosters airHosters3 = new AirHosters();
//		airHosters3.setName("AirHosters 3");
//		airHosters3.setAge("27");
//		
//		ArrayList<AirHosters> list = new ArrayList<AirHosters>();
//		list.add(airHosters);
//		list.add(airHosters2);
//		list.add(airHosters3);
//		
//		flight.setAirHostersList(list);
//		
//		assoicationRepository.saveFlightDetails(flight);

//		Product product = new Product();
//		product.setName("Milk");
//
//		Product product2 = new Product();
//		product2.setName("Tea");
//
//		ArrayList<Product> productList = new ArrayList<Product>();
//		productList.add(product2);
//		productList.add(product);
//
//		Brand brand = new Brand();
//		brand.setBrand("amul");
//
//		Brand brand2 = new Brand();
//		brand2.setBrand("chaivenue");
//
//		brand.setProducts(productList);
//		brand2.setProducts(productList);
//
//		ArrayList<Brand> brandList = new ArrayList<Brand>();
//		brandList.add(brand2);
//		brandList.add(brand);
//
//		product.setBrand(brandList);
//		product2.setBrand(brandList);
//
//		assoicationRepository.saveBrandDetails(brand);

	}
}
