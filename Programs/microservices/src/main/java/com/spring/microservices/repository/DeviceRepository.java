package com.spring.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.microservices.entity.Device;

public interface DeviceRepository extends JpaRepository<Device, Integer>{

}
