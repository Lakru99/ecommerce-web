package com.aqurumedia.ecom.order.domain.user.vo;

import com.aqurumedia.ecom.shared.error.domain.Assert;

public record UserLastname(String value) {
  public UserLastname {
    Assert.field("value", value).maxLength(255);
  }
}
