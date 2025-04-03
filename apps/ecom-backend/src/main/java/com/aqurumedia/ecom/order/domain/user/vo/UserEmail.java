package com.aqurumedia.ecom.order.domain.user.vo;

import com.aqurumedia.ecom.shared.error.domain.Assert;

public record UserEmail(String value) {

  public UserEmail {
    Assert.field("value", value).maxLength(255);
  }
}
