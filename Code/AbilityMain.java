/**
 * Names: Bonny Chen 
 * Date: April 28th, 2022 
 * Description: Class to call the abilities
 */

import java.io.*;

public class AbilityMain {

	public static void main(String[] args) throws IOException {
		
		// Sage abilities
		Ability barrierOrb = new Ability("Barrier Orb", 400, 0, 1, false, false, false, false, false, false, false, false, false);
		Ability slowOrb = new Ability("Slow Orb", 200, 0, 2, false, true, false, false, false, false, false, false, false);
		Ability healingOrb = new Ability("Healing Orb", 0, 0, 1, false, false, false, false, false, false, false, false, false);
		Ability Resurrection = new Ability("Resurrection", 0, 0, 1, false, false, false, false, false, false, false, false, true);
		
		// Astra abilities
		Ability gravityWell = new Ability("Gravity Well", 200, 0, 1, false, true, false, false, true, false, true, false, false);
		Ability novaPulse = new Ability("Nova Pulse", 200, 0, 1, false, false, true, false, false, false, false, false, false);
		Ability nebula = new Ability("Nebula", 200, 0, 2, false, false, false, false, false, false, false, false, false);
		Ability cosmicDivide = new Ability("Cosmic Divide", 0, 0, 1, false, false, false, false, false, false, false, false, true);
		
		// Brimstone abilities 
		Ability incendiary = new Ability("Incediary", 250, 60, 1, false, false, false, false, false, false, false, false, false);
		Ability stimBeacon = new Ability("Stim Beacon", 250, 0, 1, false, false, false, false, false, false, false, true, false);
		Ability skySmoke = new Ability("Sky Smoke", 100, 0, 3, false, false, false, false, false, false, false, false, false);
		Ability orbitalStrike = new Ability("Orbital Strike", 0, 156, 0, false, false, false, false, false, false, false, false, true);
		
		// Breach abilities 
		Ability afterschok = new Ability("Aftershock", 200, 250, 1, false, false, false, false, false, false, false, false, false);
		Ability flashpoint = new Ability("Flashpoint", 250, 0, 2, true, false, false, false, false, false, false, false, false);
		Ability faultLine = new Ability("Fault Line", 0, 0, 1, false, false, true, false, false, false, false, false, false);
		Ability rollingThunder = new Ability("Rolling Thunder", 0, 0, 1, false, false, true, false, false, false, false, false, true);
		
		// Fade abilities
		Ability prowler = new Ability("Prowler", 250, 0, 2, true, false, false, false, false, true, false, false, false);
		Ability seize = new Ability("Seize", 200, 0, 1, false, false, true, false, false, true, true, false, false);
		Ability haunt = new Ability("Haunt", 0, 0, 1, false, false, false, false, false, true, false, false, false);
		Ability nightfall = new Ability("Nightfall", 0, 0, 1, true, false, false, true, false, true, false, false, true);
	
		// Yoru abilities 
		Ability fakeout = new Ability("Fakeout", 100, 0, 1, true, false, false, false, false, true, false, false, false);
		Ability blindside = new Ability("Blindside", 250, 0, 2, true, false, false, false, false, false, false, false, false);
		Ability gatecrash = new Ability("Gatecrash", 200, 0, 2, false, false, false, false, false, false, false, false, false);
		Ability dimensionalDrift = new Ability("Dimensional Drift", 0, 0, 1, false, false, false, false, false, false, false, false, true);
	    
		// Chamber abilities 
		Ability tradeMark = new Ability("Trade Mark", 150, 0, 2, false, true, false, false, false, true, false, false, false);
		Ability headHunter = new Ability("Head Hunter", 100, 0, 8, false, false, false, false, false, false, false, false, false);
		Ability rendezvous = new Ability("Rendezvous", 0, 0, 2, false, false, false, false, false, false, false, false, false);
		Ability tourDeForce = new Ability("Tour De Force", 0, 255, 1, false, false, false, false, false, false, false, false, true);
		
		// Killjoy abilities 
		Ability alarmBot = new Ability("Alarm Bot", 200, 0, 1, false, false, false, false, true, true, false, false, false);
		Ability nanoswarm = new Ability("Nanoswarm", 200, 180, 2, false, false, false, false, false, false, false, false, false);
		Ability turret = new Ability("Turret", 0, 24, 1, false, false, false, false, false, true, false, false, false);
		Ability lockdown = new Ability("Lockdown", 0, 0, 1, false, false, false, false, true, false, false, false, true);
		
		// Cypher abilities
		Ability trapwire = new Ability("Trapwire", 200, 5, 2, false, true, true, false, false, true, true, false, false);
		Ability cyberCage = new Ability("Cyber Cage", 100, 0, 2, false, false, false, false, false, false, false, false, false);
		Ability spycam = new Ability("Spycam", 0, 0, 1, false, false, false, false, false, true, false, false, false);
		Ability neuralTheft = new Ability("Neural Theft", 0, 0, 1, false, false, false, false, false, true, false, false, true);
		
		// Viper abilities
		Ability snakeBite = new Ability("Snake Bite", 200, 12, 2, false, false, false, false, true, false, false, false, false);
		Ability poisonCloud = new Ability("Poison Cloud", 200, 0, 1, false, false, false, true, false, false, false, false, false);
		Ability toxicScreen = new Ability("Toxic Screen", 0, 0, 1, false, false, false, true, false, false, false, false, false);
		Ability vipersPit = new Ability("Viper's Pit", 0, 0, 1, false, false, false, true, false, false, false, false, true);
		 
		// Sova abilities
		Ability owlDrone = new Ability("Owl Drone", 400, 0, 1, false, false, false, false, false, true, false, false, false);
		Ability shockBolt = new Ability("Shock Bolt", 150, 75, 2, false, false, false, false, false, false, false, false, false);
		Ability reconBolt = new Ability("Recon Bolt", 0, 0, 1, false, false, false, false, false, true, false, false, false);
		Ability huntersFury = new Ability("Hunters Fury", 0, 80, 1, false, false, false, false, false, true, false, false, true);
		 
		// Skye abilities
		Ability regrowth = new Ability("Regrowth", 200, 0, 1, false, false, false, false, false, false, false, false, false);
		Ability trailblazer = new Ability("Trailblazer", 250, 30, 1, false, true, true, false, false, true, false, false, false);
		Ability guidingLight = new Ability("Guiding Light", 250, 0, 2, true, false, false, false, false, true, false, false, false);
		Ability seekers = new Ability("Seekers", 0, 0, 1, false, true, true, false, false, true, false, false, true);
		 
		// Omen abilities
		Ability shroudedStep = new Ability("Shrouded Step", 100, 0, 2, false, false, false, false, false, false, false, false, false);
		Ability paranoia = new Ability("Paranoia", 300, 0, 1, true, false, false, false, false, false, false, false, false);
		Ability darkCover = new Ability("Dark Cover", 150, 0, 2, false, false, false, false, false, false, false, false, false);
		Ability fromTheShadows = new Ability("From The Shadows", 0, 0, 1, false, false, false, false, false, false, false, false, true);
		 
		// Raze abilities
		Ability boomBot = new Ability("Boom Bot", 300, 80, 1, false, false, false, false, false, true, false, false, false);
		Ability blastPack = new Ability("Blast Pack", 200, 50, 2, false, false, false, false, false, false, false, false, false);
		Ability paintShells = new Ability("Paint Shells", 0, 55, 1, false, false, false, false, false, false, false, false, false);
		Ability showstopper = new Ability("Showstopper", 0, 150, 1, false, false, false, false, false, false, false, false, true);
		 
		// Reyna abilities
		Ability leer = new Ability("Leer", 250, 0, 2, true, false, false, false, false, false, false, false, false);
		Ability devour = new Ability("Devour", 200, 0, 2, false, false, false, false, false, false, false, false, false);
		Ability dismiss = new Ability("Dismiss", 200, 0, 2, false, false, false, false, false, false, false, true, false);
		Ability empress = new Ability("Empress", 0, 0, 1, false, false, false, false, false, false, false, false, true);
		 
		// Phoenix abilities
		Ability blaze = new Ability("Blaze", 200, 30, 1, false, false, false, false, false, false, false, false, false);
		Ability curveball = new Ability("Curveball", 250, 0, 2, true, false, false, false, false, false, false, false, false);
		Ability hotHands = new Ability("Hot Hands", 0, 60, 1, false, false, false, false, false, false, false, false, false);
		Ability runItBack = new Ability("Run It Back", 0, 0, 1, false, false, false, false, false, false, false, false, true);
		
		// Jett abilities
		Ability cloudBurst = new Ability("Cloudburst", 200, 0, 2, false, false, false, false, false, false, false, false, false);
		Ability upDraft = new Ability("Updraft", 150, 0, 2, false, false, false, false, false, false, false, false, false);
		Ability tailWind = new Ability("Tailwind", 0, 0, 1, false, false, false, false, false, false, false, false, false);
		Ability bladeStorm = new Ability("Blade Storm", 0, 0, 1, false, false, false, false, false, false, false, false, true);
		
		// Neon abilities
		Ability fastLane = new Ability("Fast Lane", 300, 0, 1, false, false, false, false, false, false, false, false, false);
		Ability relayBolt = new Ability("Relay Bolt", 200, 0, 2, false, false, true, false, false, false, false, false, false);
		Ability highGear = new Ability("High Gear", 0, 0, 1, false, false, false, false, false, false, false, true, false);
		Ability overDrive= new Ability("Overdrive", 0, 0, 1, false, false, false, false, false, false, false, false, true);
		
	}

}
