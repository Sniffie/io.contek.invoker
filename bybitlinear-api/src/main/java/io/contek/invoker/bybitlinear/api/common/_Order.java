package io.contek.invoker.bybitlinear.api.common;

import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public class _Order {

  public String order_id;
  public Long user_id;
  public String symbol;
  public String side;
  public String order_type;
  public Double price;
  public Double qty;
  public String time_in_force;
  public String order_status;
  public String last_exec_time;
  public String last_exec_price;
  public double leaves_qty;
  public double leaves_value;
  public Double cum_exec_qty;
  public Double cum_exec_value;
  public Double cum_exec_fee;
  public String reject_reason;
  public String order_link_id;
  public Boolean reduce_only;
  public Boolean close_on_trigger;
  public String created_at;
  public String created_time;
  public String updated_at;
  public String updated_time;
  public double take_profit;
  public double stop_loss;
  public String tp_trigger_by;
  public String sl_trigger_by;
}
