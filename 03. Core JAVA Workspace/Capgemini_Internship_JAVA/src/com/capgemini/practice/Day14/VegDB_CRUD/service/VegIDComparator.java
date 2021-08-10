package com.capgemini.practice.Day14.VegDB_CRUD.service;
import java.util.Comparator;

import com.capgemini.practice.Day14.VegDB_CRUD.model.Vegetable;

public class VegIDComparator implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable v1, Vegetable v2) {
		
		if(v1.getVegID() == v2.getVegID()) 		return 0;
		else if(v1.getVegID() > v2.getVegID()) 	return 1;
		else 									return -1;
	}

	
}
