package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	//参数
	private Integer id;
        //姓名
	private String name;
	private Integer number;
}
