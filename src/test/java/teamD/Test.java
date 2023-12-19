package teamD;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import teamD.project.dao.MproductDao;
import teamD.project.dto.MproductDto;

public class Test {
	
	
	public static void main(String[] args) {
		MproductDao dao = MproductDao.getInstance();
		MproductDto dto = new MproductDto();
		
		Map<String,MproductDto> map = new HashMap<>();
		map.put("pcode", dto);
		
		List<MproductDto> list = dao.recentlist(map);
		
		System.out.println(list);
	}
	
}
