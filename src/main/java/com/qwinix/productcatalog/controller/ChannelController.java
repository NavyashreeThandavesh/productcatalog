package com.qwinix.productcatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qwinix.productcatalog.model.Channel;
import com.qwinix.productcatalog.service.ChannelService;

public class ChannelController {
	@Autowired
	ChannelService channelService;
	
	@GetMapping("/channel")
	public @ResponseBody String readChannel(@RequestParam int id) {
		
		Channel channel = channelService.readChannel(id);
		return channel.toString();
	}
	
	@PostMapping("/channel")
	public @ResponseBody String createChannel(@RequestParam int id) {
		
		Channel channel = channelService.readChannel(id);
		return channel.toString();
	}
	
	@PutMapping("/channel")
	public @ResponseBody String updateChannel(@RequestParam int id) {
		
		Channel channel = channelService.readChannel(id);
		return channel.toString();
	}
	
	@DeleteMapping("/channel")
	public @ResponseBody String deleteChannel(@RequestParam int id) {
		
		Channel channel = channelService.readChannel(id);
		return channel.toString();
	}

}
