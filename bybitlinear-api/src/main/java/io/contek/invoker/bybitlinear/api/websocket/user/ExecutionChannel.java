package io.contek.invoker.bybitlinear.api.websocket.user;

import io.contek.invoker.bybitlinear.api.websocket.WebSocketChannel;
import io.contek.invoker.bybitlinear.api.websocket.WebSocketChannelId;
import io.contek.invoker.bybitlinear.api.websocket.common.WebSocketTopicMessage;

import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import javax.annotation.concurrent.ThreadSafe;
import java.util.List;

@ThreadSafe
public final class ExecutionChannel extends WebSocketChannel<ExecutionChannel.Id, ExecutionChannel.Message> {

  ExecutionChannel() {
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
      super("execution");
    }
  }

  @NotThreadSafe
  public static final class Message extends WebSocketTopicMessage {

    public List<Data> data;
  }

  @NotThreadSafe
  public static final class Data {

    public String symbol;
    public String side;
    public String order_id;
    public String exec_id;
    public String order_link_id;
    public String price;
    public double order_qty;
    public String exec_type;
    public double exec_qty;
    public String exec_fee;
    public double leaves_qty;
    public boolean is_maker;
    public String trade_time;
  }
}
