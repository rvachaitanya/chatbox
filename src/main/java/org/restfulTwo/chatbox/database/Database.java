package org.restfulTwo.chatbox.database;

import java.util.HashMap;

import org.restfulTwo.chatbox.model.Message;
import org.restfulTwo.chatbox.model.Profile;

public class Database {
	private static HashMap<Long,Message> message = new HashMap<>();
	private HashMap<Long,Profile> profile = new HashMap<>();
	
	public static HashMap<Long,Message> getMessage(){
		return message;
	}
	
	public HashMap<Long,Profile> getProfile(){
		return profile;
	}
}
