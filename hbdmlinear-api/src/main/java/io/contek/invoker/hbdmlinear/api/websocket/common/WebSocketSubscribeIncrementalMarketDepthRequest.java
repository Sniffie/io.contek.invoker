package io.contek.invoker.hbdmlinear.api.websocket.common;

import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public final class WebSocketSubscribeIncrementalMarketDepthRequest
    extends WebSocketSubscribeRequest {

  public String data_type;
}