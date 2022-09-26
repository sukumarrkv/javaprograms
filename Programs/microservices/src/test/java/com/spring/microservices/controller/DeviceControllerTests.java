package com.spring.microservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.microservices.entity.Customer;
import com.spring.microservices.entity.Device;
import com.spring.microservices.service.DeviceService;

@RunWith(SpringRunner.class)
@WebMvcTest(DeviceController.class)
public class DeviceControllerTests {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private DeviceService service;
	
	@Test
	public void getAllDevicesTest() throws Exception {
		List<Device> devicesList = new ArrayList<Device>();
		Customer customer = new Customer();
		Device device = new Device(1, "name", "location", customer);
		devicesList.add(device);
		Mockito.when(service.getDevices()).thenReturn(devicesList);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/alldevices")
				.accept(MediaType.APPLICATION_JSON))
		        .andExpect(MockMvcResultMatchers.status().isOk())
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(MockMvcResultMatchers.jsonPath("$.[0].deviceName").value("name"));
	}
	
	@Test
	public void getDevicesTest() throws Exception {
		List<Device> deviceList = new ArrayList<Device>();
		Customer customer = new Customer();
		Device device = new Device(1, "name", "location", customer);
		deviceList.add(device);
		Mockito.when(service.getDevices()).thenReturn(deviceList);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/alldevices").accept(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andDo(MockMvcResultHandlers.print())
		.andExpect(MockMvcResultMatchers.jsonPath("$.[0].deviceName").value("name"));
	}
	
	@Test
	public void getDeviceTest() throws Exception {
		Customer customer = new Customer();
		Device device = new Device(1, "name", "location", customer);
		Mockito.when(service.getOneDevice(Mockito.anyInt())).thenReturn(device);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/onedevice/1")
				.accept(MediaType.APPLICATION_JSON))
		        .andExpect(MockMvcResultMatchers.status().isOk())
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(MockMvcResultMatchers.jsonPath("$.deviceId").value(1));
	}
	
	@Test
	public void createDeviceTest() throws Exception {
		Device device = new Device();
		device.setDeviceName("a");
		device.setDeviceLocation("l");
		Mockito.when(service.createDevice(Mockito.any(Device.class))).thenReturn(device);
		
		mockMvc.perform(MockMvcRequestBuilders.post("/createdevice")
				.contentType(MediaType.APPLICATION_JSON).content(jsonToString(device))
				.accept(MediaType.APPLICATION_JSON))
		        .andExpect(MockMvcResultMatchers.status().isOk())
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(MockMvcResultMatchers.jsonPath("$.deviceName").value("a"));
	}
	
	@Test
	public void updateDeviceTest() throws Exception {
		Device device = new Device();
		device.setDeviceName("b");
		device.setDeviceLocation("l");
		Mockito.when(service.updateDevice(Mockito.any(Device.class))).thenReturn(device);
		
		mockMvc.perform(MockMvcRequestBuilders.put("/updatedevice")
				.contentType(MediaType.APPLICATION_JSON).content(jsonToString(device))
				.accept(MediaType.APPLICATION_JSON))
		        .andExpect(MockMvcResultMatchers.status().isOk())
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(MockMvcResultMatchers.jsonPath("$.deviceName").value("b"));
	}
	
	@Test
	public void deleteDeviceTest() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.delete("/deletedevice/1")
				.accept(MediaType.APPLICATION_JSON))
		        .andExpect(MockMvcResultMatchers.status().isOk())
		        .andDo(MockMvcResultHandlers.print());
	}
	
	
	private static String jsonToString(Object obj) throws JsonProcessingException{
		ObjectMapper om = new ObjectMapper();
		String result = om.writeValueAsString(obj);
		return result;
	}
}
