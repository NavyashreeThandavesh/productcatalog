package com.qwinix.productcatalog.service;

import com.qwinix.productcatalog.model.Channel;

public interface ChannelServiceImp {
	Channel readChannel(int id);
	Channel createChannel(int id);
	Channel updateChannel(int id);
	Channel deleteChannel(int id);
}
