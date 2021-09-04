package org.prgrms.kdt.voucher;

import java.text.MessageFormat;
import java.util.UUID;

public class PercentDiscountVoucher implements Voucher {
  private final UUID voucherId;
  private final long percent;

  public PercentDiscountVoucher(final UUID voucherId, final long percent) {
    this.voucherId = voucherId;
    this.percent = percent;
  }

  @Override
  public UUID getVoucherId() {
    return voucherId;
  }

  @Override
  public long discount(final long beforeDiscount) {
    return beforeDiscount * (percent / 100);
  }

  @Override
  public String toString() {
    return MessageFormat.format("PercentDiscountVoucher( voucherId = {0}, percent = {1}% )", voucherId, percent);
  }
}
