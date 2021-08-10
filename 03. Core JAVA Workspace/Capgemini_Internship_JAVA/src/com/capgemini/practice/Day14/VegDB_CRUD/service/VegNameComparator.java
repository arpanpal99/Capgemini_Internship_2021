package com.capgemini.practice.Day14.VegDB_CRUD.service;

import java.util.Comparator;

import com.capgemini.practice.Day14.VegDB_CRUD.model.Vegetable;

public class VegNameComparator implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable v1, Vegetable v2) {
		
		return v1.getVegName().compareTo(v2.getVegName());
	}

}
