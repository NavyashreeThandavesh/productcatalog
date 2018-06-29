package com.qwinix.productcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qwinix.productcatalog.model.Channel;


@Repository("channelRepository")
public interface ChannelRepository extends JpaRepository<Channel, Integer>{
	Channel findById(int id);

}