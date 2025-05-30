package com.aqurumedia.ecom.order.domain.user.repository;

import com.aqurumedia.ecom.order.domain.user.aggregate.User;
import com.aqurumedia.ecom.order.domain.user.vo.UserAddress;
import com.aqurumedia.ecom.order.domain.user.vo.UserEmail;
import com.aqurumedia.ecom.order.domain.user.vo.UserPublicId;

import java.time.Instant;
import java.util.Optional;

public interface UserRepository {
  void save(User user);
  Optional<User>  get(UserPublicId userPublicId);
  Optional<User> getOneByEmail(UserEmail userEmail);
  void updateAddress(UserPublicId userPublicId, UserAddress userAddress);
}
