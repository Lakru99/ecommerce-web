package com.aqurumedia.ecom.order.domain.user.vo;

import com.aqurumedia.ecom.shared.error.domain.Assert;

public record UserFirstName(String value) {
  public UserFirstName {
    Assert.field("value", value).maxLength(255);
  }
}
