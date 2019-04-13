package com.imooc.sexy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Unruly Wind on 2019/4/13/013.
 *
 * @author BlueMelancholy
 * @desc:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private Integer id;
	private String buyerName;
}
