package com.ssafy.map.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.map.model.CoronaDto;
import com.ssafy.map.model.HospitalDto;
import com.ssafy.map.model.InterDto;
import com.ssafy.map.model.MapDto;
import com.ssafy.map.model.MetroDto;
import com.ssafy.map.model.StarBucksDto;

//@Mapper
public interface MapDao {

	ArrayList<MapDto> search(Map<String, String> map) throws SQLException;

	ArrayList<InterDto> getInterDto(String userId) throws SQLException;

	void addinter(InterDto interDto) throws SQLException;

	int interDupCheck(Map<String, String> map) throws SQLException;

	void delinter(Map<String, String> map) throws SQLException;

	ArrayList<CoronaDto> corona(Map<String, String> map) throws SQLException;

	ArrayList<HospitalDto> hospital(Map<String, String> map) throws SQLException;

	StarBucksDto getCoffee(Map<String, String> map) throws SQLException;

	MetroDto getMetro(Map<String, String> map) throws SQLException;

	String getSido(String string) throws SQLException;

	String getGugun(String string) throws SQLException;

}

