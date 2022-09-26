package com.spring.microservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.microservices.entity.Device;
import com.spring.microservices.exception.DeviceNotCreatedException;
import com.spring.microservices.exception.DeviceNotFoundException;
import com.spring.microservices.repository.DeviceRepository;

@Service
public class DeviceService {

	@Autowired
	private DeviceRepository deviceRepository;
	
	public List<Device> getDevices(){
		return deviceRepository.findAll();
	}
	
	public Device getOneDevice(Integer deviceId){
		 Optional<Device> device = deviceRepository.findById(deviceId);
		 if(!device.isPresent()){
			throw new DeviceNotFoundException("Device not found");
		 }
		return device.get();
	}
	
	public Device createDevice(Device device){
		return deviceRepository.save(device);
	}
	
	public Device updateDevice(Device device) {
		return deviceRepository.save(device);
	}
	
	public void deleteDevice(Integer deviceId){
		deviceRepository.deleteById(deviceId);
	}

	
}
