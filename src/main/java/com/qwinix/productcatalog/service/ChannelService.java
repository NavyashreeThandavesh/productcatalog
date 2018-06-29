package com.qwinix.productcatalog.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.qwinix.productcatalog.model.Channel;
import com.qwinix.productcatalog.repository.ChannelRepository;

public class ChannelService implements ChannelServiceImp {

	@Autowired
	ChannelRepository channelRepository;

	@Override
	public Channel readChannel(int id) {
		return channelRepository.findById(id);
	}

	@Override
	public Channel createChannel(int id) {
		return channelRepository.findById(id);
	}

	@Override
	public Channel updateChannel(int id) {
		return channelRepository.findById(id);
	}

	@Override
	public Channel deleteChannel(int id) {
		return channelRepository.findById(id);
	}

}
