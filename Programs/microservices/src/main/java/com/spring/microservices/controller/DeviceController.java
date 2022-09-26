package com.spring.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservices.entity.Device;
import com.spring.microservices.service.DeviceService;

@RestController
public class DeviceController {

	@Autowired
	private DeviceService deviceService;
	
	@GetMapping("/alldevices")
	public ResponseEntity<List<Device>> getAllDevices(){
		return new ResponseEntity<List<Device>>(deviceService.getDevices(), HttpStatus.OK);
	}
	@GetMapping("/onedevice/{deviceId}")
	public Device getOneDevice(@PathVariable Integer deviceId){
		return deviceService.getOneDevice(deviceId);
	}
	
	@PostMapping("/createdevice")
	public Device createDevice(@RequestBody Device device){
		return deviceService.createDevice(device);
	}
	
	@PutMapping("/updatedevice")
	public Device updateDevice(@RequestBody Device device){
		return deviceService.updateDevice(device);
	}
	
	@DeleteMapping("/deletedevice/{deviceId}")
	public String deleteDevice(@PathVariable Integer deviceId){
		deviceService.deleteDevice(deviceId);
		return "Device deleted successfully";
	}
	
}
