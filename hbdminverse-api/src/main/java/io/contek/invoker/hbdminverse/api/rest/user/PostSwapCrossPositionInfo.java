package io.contek.invoker.hbdminverse.api.rest.user;

import com.google.common.collect.ImmutableList;
import io.contek.invoker.commons.actor.IActor;
import io.contek.invoker.commons.actor.ratelimit.RateLimitQuota;
import io.contek.invoker.commons.rest.RestContext;
import io.contek.invoker.commons.rest.RestParams;
import io.contek.invoker.hbdminverse.api.common._PositionInfo;
import io.contek.invoker.hbdminverse.api.rest.common.RestDataResponse;

import javax.annotation.concurrent.NotThreadSafe;
import java.util.List;

import static io.contek.invoker.hbdminverse.api.ApiFactory.RateLimits.ONE_API_KEY_REST_PRIVATE_READ_REQUEST;

@NotThreadSafe
public final class PostSwapCrossPositionInfo
    extends UserRestRequest<PostSwapCrossPositionInfo.Response> {

  private String contract_code;

  PostSwapCrossPositionInfo(IActor actor, RestContext context) {
    super(actor, context);
  }

  public PostSwapCrossPositionInfo setContractCode(String contract_code) {
    this.contract_code = contract_code;
    return this;
  }

  @Override
  protected Class<Response> getResponseType() {
    return Response.class;
  }

  @Override
  protected String getEndpointPath() {
    return "/swap-api/v1/swap_cross_position_info";
  }

  @Override
  protected RestParams getParams() {
    RestParams.Builder builder = RestParams.newBuilder();

    if (contract_code != null) {
      builder.add("contract_code", contract_code);
    }

    return builder.build();
  }

  @Override
  protected ImmutableList<RateLimitQuota> getRequiredQuotas() {
    return ONE_API_KEY_REST_PRIVATE_READ_REQUEST;
  }

  @NotThreadSafe
  public static final class Response extends RestDataResponse<List<_PositionInfo>> {}
}
