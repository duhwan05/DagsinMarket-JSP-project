package teamD.project.dto;

import java.sql.Timestamp;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class MproductDto {

	private String pname;
	private int pcode;
	private String ID;
	private int price;
	private String brand;
	private int psize;
	private String category;
	private int readCount;
	private Timestamp craeteAt;

	
	

}
