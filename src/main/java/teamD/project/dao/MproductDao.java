package teamD.project.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import mybatis.SqlSessionBean;
import teamD.project.dto.MproductDto;


public class MproductDao {
   private static MproductDao dao = new MproductDao();
   private MproductDao() {}
   public static MproductDao getInstance() {
      return dao;
   }


   public List<MproductDto> list() {
      SqlSession mapper = SqlSessionBean.getSession();
      List<MproductDto> list = mapper.selectList("Mproduct.list");
      mapper.close();
      return list;
   }
   
   public List<MproductDto> recentlist(Map<String,MproductDto> map) {
	      SqlSession mapper = SqlSessionBean.getSession();
	      List<MproductDto> list = mapper.selectList("Mproduct.recentlist");
	      mapper.close();
	      return list;
	   }
   
   
   public List<MproductDto> mostlist() {
      SqlSession mapper = SqlSessionBean.getSession();
      List<MproductDto> list = mapper.selectList("Mproduct.mostlist");
      mapper.close();
      return list;
      
   }
   
   public List<MproductDto> pnamelist(String pname) {
	      SqlSession mapper = SqlSessionBean.getSession();
	      List<MproductDto> list = mapper.selectList("Mproduct.list",pname);
	      mapper.close();
	      return list;
	   }
   
   
   public int count() {
      SqlSession mapper = SqlSessionBean.getSession();
      int result = mapper.selectOne("Mproduct.count");
      mapper.close();
      return result;
}
}