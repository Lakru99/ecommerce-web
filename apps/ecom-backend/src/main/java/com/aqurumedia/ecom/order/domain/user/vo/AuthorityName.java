package com.aqurumedia.ecom.order.domain.user.vo;

import com.aqurumedia.ecom.shared.error.domain.Assert;

public record AuthorityName(String name) {

  public AuthorityName {
    Assert.field("name", name).notNull();
  }
}
