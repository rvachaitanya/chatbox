package org.restfulTwo.chatbox.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.restfulTwo.chatbox.model.Message;
import org.restfulTwo.chatbox.service.MessegeService;

@Path("/messages")
public class MessageResource {
	
	MessegeService msgser = new MessegeService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMethod(){
		return msgser.getAllMessages();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message){
		return msgser.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") long Id, Message message){
		message.setId(Id);
		return msgser.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("messageId") long Id){
		msgser.removeMessage(Id);
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam ("messageId")long id){
		return msgser.getMessage(id);
		//return "got param value "+messageId; 
	}
}
