package com.joboa.friends.service;

import com.joboa.friends.model.Friend;
import org.springframework.data.repository.CrudRepository;

public interface FriendService extends CrudRepository<Friend, Integer> {
}
