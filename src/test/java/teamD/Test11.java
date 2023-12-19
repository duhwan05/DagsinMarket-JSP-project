package teamD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import mybatis.SqlSessionBean;
import teamD.project.dao.MproductDao;
import teamD.project.dto.MproductDto;

class Test11 {

	
	  @Test void write() { MproductDao dao = MproductDao.getInstance();
	  List<MproductDto> list = dao.mostlist();
	  
	  System.out.println(list); assertNotNull(list);
	  
	  }
	  
		/*
		 * @Test void all() { MproductDao dao = MproductDao.getInstance();
		 * List<MproductDto> list = dao.list(); System.out.println(list);
		 * assertNotNull(list);
		 * 
		 * 
		 * }
		 */
	 

	/*
	 * @Test void write() { SqlSession mapper = SqlSessionBean.getSession(); }
	 */

}
