package org.restfulTwo.chatbox.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.restfulTwo.chatbox.database.Database;
import org.restfulTwo.chatbox.model.Message;

public class MessegeService<MessegeService> {
	
	private HashMap<Long,Message> messages = Database.getMessage();
	
	
	public MessegeService(){
		messages.put(1L, new Message(1,"rva","welcome"));
		messages.put(2L, new Message(2,"two","welcome bak"));
	}
	
	public List<Message> getAllMessages(){
		ArrayList<Message> list = new ArrayList<Message>(messages.values());
		return list;
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getId()<=0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
}

