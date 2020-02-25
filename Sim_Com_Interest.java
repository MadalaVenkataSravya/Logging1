package com.epam.Logging1;
import java.lang.Math;
public class Sim_Com_Interest {
	float a,b;
	public float simpleinterest(int principal,int time,float rate) {
		a=((principal*time*rate)/100);
		return a;
	}
    public float compoundinterest(int principal,int time,float rate) {
    	b=(float)(principal*Math.pow(1+(rate/100),time));
    	return b;
    }
}
