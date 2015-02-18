package com.weebly.lightsoutgming.hacking.simulator.main;

import java.awt.Color;
import java.awt.Font;

import io.brace.lightsoutgaming.engine.LightsOut;
import io.brace.lightsoutgaming.engine.Network.NetworkUtils;

public class Main extends LightsOut {
	
	public static void main(String[] args){
		new Main().init();
	}

	@Override
	protected void init() {
		// TODO Auto-generated method stub
		this.createDisplay("Hacking Simulator", 800, 600);
		this.start();
	}

	@Override
	protected void render() {
		// TODO Auto-generated method stub
		screen.clear();
		screen.renderString(10, 10, "Whatever Text I Want!", Color.red, new Font("Default", 0, 20), true);
		for(int i = 0; i < NetworkUtils.myObjects.size(); i++){
			NetworkUtils.myObjects.get(i).render(screen);
		}
		this.show();
	}

	@Override
	protected void update() {
		// TODO Auto-generated method stub
		for(int i = 0; i < NetworkUtils.myObjects.size(); i++){
			NetworkUtils.myObjects.get(i).update();
		}
	}
	
}
