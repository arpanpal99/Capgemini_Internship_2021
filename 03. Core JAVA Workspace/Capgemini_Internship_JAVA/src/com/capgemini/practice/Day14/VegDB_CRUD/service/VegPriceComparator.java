package com.capgemini.practice.Day14.VegDB_CRUD.service;

import java.util.Comparator;

import com.capgemini.practice.Day14.VegDB_CRUD.model.Vegetable;

public class VegPriceComparator implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable v1, Vegetable v2) {
		if(v1.getVegPrice() == v2.getVegPrice()) 		return 0;
		else if(v1.getVegPrice() > v2.getVegPrice()) 	return 1;
		else 											return -1;
	}

	
}
