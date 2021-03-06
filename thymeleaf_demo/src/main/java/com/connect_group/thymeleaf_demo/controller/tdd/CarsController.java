package com.connect_group.thymeleaf_demo.controller.tdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.connect_group.thymeleaf_demo.beans.cars.CarMake;
import com.connect_group.thymeleaf_demo.beans.cars.CarModel;

@Controller
public class CarsController {

	@RequestMapping({"/tdd/cars.html"})
    public ModelAndView cars() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("carMakes", getCarMakes());
        return new ModelAndView("tdd/cars/cars", model);
    }
	
	private List<CarMake> getCarMakes() {
		List<CarMake> carMakes = new ArrayList<>();
		
		CarMake jaguar = new CarMake("Jaguar");
		List<CarModel> jaguarModels = new ArrayList<>();
		jaguarModels.add(new CarModel("XE"));
		jaguarModels.add(new CarModel("XF"));
		jaguarModels.add(new CarModel("XJ"));
		jaguarModels.add(new CarModel("F-TYPE"));
		jaguar.setModels(jaguarModels);
		carMakes.add(jaguar);
		
		CarMake landRover = new CarMake("Land Rover");
		List<CarModel> landRoverModels = new ArrayList<>();
		landRoverModels.add(new CarModel("Defender"));
		landRoverModels.add(new CarModel("Discovery"));
		landRoverModels.add(new CarModel("Discovery Sport"));
		landRoverModels.add(new CarModel("Range Rover Evoque"));
		landRoverModels.add(new CarModel("Range Rover Sport"));
		landRoverModels.add(new CarModel("Range Rover"));
		landRover.setModels(landRoverModels);
		carMakes.add(landRover);
		
		return carMakes;
	}
}
