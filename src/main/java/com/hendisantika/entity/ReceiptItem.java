package com.hendisantika.entity;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-download-pdf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/02/22
 * Time: 06.18
 */
@Data
public class ReceiptItem {
    private String description;
    private Integer quantity;
    private Double unitPrice;
    private Double total;
}
