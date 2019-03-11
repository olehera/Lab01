package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	private List<String> pa;
		
	public Parole() {
		pa = new LinkedList<String>();
		//pa = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		pa.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(pa);
		return pa;
	}
	
	public void reset() {
		pa.clear();
	}
	
	public void remParola(String s) {
		pa.remove(s);
	}

}
