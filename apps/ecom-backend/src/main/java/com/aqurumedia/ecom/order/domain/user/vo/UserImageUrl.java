package com.aqurumedia.ecom.order.domain.user.vo;

import com.aqurumedia.ecom.shared.error.domain.Assert;

public record UserImageUrl(String value) {

  public UserImageUrl {
    Assert.field("value", value).maxLength(1000);
  }
}
