package io.contek.invoker.bybitlinear.api.websocket.user;

import io.contek.invoker.bybitlinear.api.websocket.WebSocketChannel;
import io.contek.invoker.bybitlinear.api.websocket.WebSocketChannelId;
import io.contek.invoker.bybitlinear.api.websocket.common.WebSocketTopicMessage;

import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import javax.annotation.concurrent.ThreadSafe;
import java.util.List;

@ThreadSafe
public final class StopOrderChannel extends WebSocketChannel<StopOrderChannel.Id, StopOrderChannel.Message> {

  StopOrderChannel() {
    super(Id.INSTANCE);
  }

  @Override
  public Class<Message> getMessageType() {
    return Message.class;
  }

  @Immutable
  public static final class Id extends WebSocketChannelId<Message> {

    private static final Id INSTANCE = new Id();

    private Id() {
      super("stop_order");
    }
  }

  @NotThreadSafe
  public static final class Message extends WebSocketTopicMessage {

    public List<Data> data;
  }

  @NotThreadSafe
  public static final class Data {

    public String stop_order_id;
    public String order_id;
    public String order_link_id;
    public String user_id;
    public String symbol;
    public String side;
    public String order_type;
    public String price;
    public double qty;
    public String time_in_force;
    public String order_status;
    public String stop_order_type;
    public String create_type;
    public String trigger_by;
    public String trigger_price;
    public Boolean reduce_only;
    public Boolean close_on_trigger;
    public String created_at;
    public String updated_at;
  }
}
