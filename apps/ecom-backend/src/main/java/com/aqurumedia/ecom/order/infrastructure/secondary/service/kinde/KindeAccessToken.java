package com.aqurumedia.ecom.order.infrastructure.secondary.service.kinde;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public record KindeAccessToken(@JsonProperty("access_token") String accessToken,@JsonProperty("token_type") String tokenType) {

}
