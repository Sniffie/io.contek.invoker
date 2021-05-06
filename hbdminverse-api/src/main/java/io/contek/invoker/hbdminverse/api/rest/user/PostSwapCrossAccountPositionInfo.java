package io.contek.invoker.hbdminverse.api.rest.user;

import com.google.common.collect.ImmutableList;
import io.contek.invoker.commons.actor.IActor;
import io.contek.invoker.commons.actor.ratelimit.RateLimitQuota;
import io.contek.invoker.commons.rest.RestContext;
import io.contek.invoker.commons.rest.RestParams;
import io.contek.invoker.hbdminverse.api.common._CrossAccountPositionInfo;
import io.contek.invoker.hbdminverse.api.rest.common.RestDataResponse;

import javax.annotation.concurrent.NotThreadSafe;

import static io.contek.invoker.hbdminverse.api.ApiFactory.RateLimits.ONE_API_KEY_REST_PRIVATE_READ_REQUEST;

@NotThreadSafe
public final class PostSwapCrossAccountPositionInfo
    extends UserRestRequest<PostSwapCrossAccountPositionInfo.Response> {

  private String margin_account;

  PostSwapCrossAccountPositionInfo(IActor actor, RestContext context) {
    super(actor, context);
  }

  public PostSwapCrossAccountPositionInfo setMarginAccount(String margin_account) {
    this.margin_account = margin_account;
    return this;
  }

  @Override
  protected Class<Response> getResponseType() {
    return Response.class;
  }

  @Override
  protected String getEndpointPath() {
    return "/swap-api/v1/swap_cross_account_position_info";
  }

  @Override
  protected RestParams getParams() {
    RestParams.Builder builder = RestParams.newBuilder();

    if (margin_account != null) {
      builder.add("margin_account", margin_account);
    }

    return builder.build();
  }

  @Override
  protected ImmutableList<RateLimitQuota> getRequiredQuotas() {
    return ONE_API_KEY_REST_PRIVATE_READ_REQUEST;
  }

  @NotThreadSafe
  public static final class Response extends RestDataResponse<_CrossAccountPositionInfo> {}
}
